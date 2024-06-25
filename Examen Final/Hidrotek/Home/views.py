from django.shortcuts import render, redirect, get_object_or_404
from .models import Product, Category
from django.core.paginator import Paginator
from django.contrib import messages
from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.models import User
from django.contrib.auth.forms import UserCreationForm
from .forms import SignUpForm
from django import forms
from django.http import JsonResponse
from io import BytesIO
from django.shortcuts import render, get_object_or_404, redirect
from django.contrib.auth.decorators import login_required
from Home.models import Product
from .models import Cart, CartItem

@login_required
def add_to_cart(request, product_id):
    product = get_object_or_404(Product, pk=product_id)
    cart, created = Cart.objects.get_or_create(user=request.user)
    cart_item, created = CartItem.objects.get_or_create(cart=cart, product=product)
    if not created:
        cart_item.quantity += 1
    cart_item.save()
    return redirect('products')

@login_required
def view_cart(request):
    cart, created = Cart.objects.get_or_create(user=request.user)
    return render(request, 'cart.html', {'cart': cart})

@login_required
def remove_from_cart(request, product_id):
    product = get_object_or_404(Product, id=product_id)
    cart = get_object_or_404(Cart, user=request.user)
    cart_item = get_object_or_404(CartItem, cart=cart, product=product)
    cart_item.delete()
    return redirect('view_cart')

@login_required
def adjust_cart(request, item_id):
    cart = Cart.objects.get(user=request.user)  # Obtén el carrito del usuario actual, ajusta esto según tu implementación
    item = get_object_or_404(CartItem, id=item_id, cart=cart)

    if request.method == 'POST':
        new_quantity = int(request.POST.get('quantity', 1))  # Obtén la nueva cantidad desde el formulario
        if new_quantity > 0:
            item.quantity = new_quantity
            item.save()

    return redirect('view_cart')  # Redirige de vuelta al carrito o a donde sea necesario
def home(request):
    return render(request, 'home.html', {})

def products(request, category_name=None):
    query = request.GET.get('q', '')
    sort = request.GET.get('sort', 'default')

    if category_name:
        current_category = get_object_or_404(Category, name=category_name)
        items = Product.objects.filter(category=current_category)
    else:
        current_category = None
        items = Product.objects.all()

    if query:
        items = items.filter(name__icontains=query)

    if sort == 'price_low_high':
        items = items.order_by('price')
    elif sort == 'price_high_low':
        items = items.order_by('-price')
    elif sort == 'newest':
        items = items.order_by('-id')
    else:
        items = items.order_by('name')

    paginator = Paginator(items, 12)  # 12 items per page
    page_number = request.GET.get('page')
    items = paginator.get_page(page_number)

    categories = Category.objects.all()
    return render(request, 'products.html', {
        'items': items,
        'categories': categories,
        'total_results': paginator.count,
        'query': query,
        'sort': sort,
    })

def services(request):
    return render(request, 'services.html', {})

def contact(request):
    return render(request, 'contact.html', {})

def category(request, foo):
    foo = foo.replace('-', ' ')
    try:
        category = Category.objects.get(name=foo)
        query = request.GET.get('q', '')
        sort = request.GET.get('sort', 'default')

        items = Product.objects.filter(category=category)
        
        if query:
            items = items.filter(name__icontains=query)

        if sort == 'price_low_high':
            items = items.order_by('price')
        elif sort == 'price_high_low':
            items = items.order_by('-price')
        elif sort == 'newest':
            items = items.order_by('-id')
        else:
            items = items.order_by('name')

        paginator = Paginator(items, 12)  # 12 items per page
        page_number = request.GET.get('page')
        items = paginator.get_page(page_number)

        categories = Category.objects.all()
        return render(request, 'category.html', {
            'items': items,
            'category': category,
            'categories': categories,
            'total_results': paginator.count,
            'query': query,
            'sort': sort,
        })
    except Category.DoesNotExist:
        messages.error(request, "That category doesn't exist...")
        return redirect('home')
    
def login_user(request):
    if request.method == "POST":
        username = request.POST['username']
        password = request.POST['password']
        user = authenticate(request, username=username, password=password)
        if user is not None:
            login(request, user)
            messages.success(request, ("You have been logged in"))
            return redirect('home')
        else:
            messages.success(request, ("There was an error please try again"))
            return redirect('login')
    else:
        return render(request, 'login.html', {})



def logout_user(request):
    logout(request)
    messages.success(request, ("You have been logout"))
    return redirect ('home')

def register_user(request):
    form= SignUpForm()
    if request.method == "POST":
        form = SignUpForm(request.POST)
        if form.is_valid():
            form.save()
            username = form.cleaned_data ['username']
            password = form.cleaned_data ['password1']
            user = authenticate(username=username, password=password)
            login(request, user)
            messages.success(request, ("You have been register succesfully"))
            return redirect('home')
        else:
            messages.success(request, ("There was an error please try again"))
            return redirect('register')
    else:
        return render(request, 'register.html', {'form':form})
    
from django.shortcuts import render, redirect, get_object_or_404
from django.http import HttpResponse
from django.template.loader import get_template
from django.contrib.auth.decorators import login_required
from django.contrib.auth.models import User
from django.core.mail import EmailMessage
from django.conf import settings
from .models import Product, Category, Cart, CartItem
import os
import tempfile
from xhtml2pdf import pisa
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders


@login_required
def procesar_formulario(request):
    # Obtener el carrito del usuario actual
    try:
        user_cart = Cart.objects.get(user=request.user)
    except Cart.DoesNotExist:
        return HttpResponse('No se encontró el carrito del usuario.')

    # Obtener los productos en el carrito
    cart_items = user_cart.cartitem_set.all()
    
    # Obtener el total del carrito
    total = user_cart.total
    for item in cart_items:
        item.subtotal = item.quantity * item.product.price
    # Obtener otros datos del cliente (por ejemplo, nombre y correo electrónico)
    nombre_cliente = request.user.get_full_name()
    email_cliente = request.user.email
    fecha_validez = '30 días'  # Define la validez de la cotización según tu negocio

    pdf_content = generar_pdf(nombre_cliente, email_cliente, fecha_validez,total,cart_items)
        
        # Si se generó correctamente el PDF
    if pdf_content:
            # Crear un archivo temporal para guardar el PDF
            with tempfile.NamedTemporaryFile(delete=False, suffix='.pdf') as temp_pdf:
                temp_pdf.write(pdf_content)
                temp_pdf_path = temp_pdf.name

            # Enviar el PDF adjunto por correo electrónico
            if enviar_email(email_cliente, temp_pdf_path):
                # Eliminar el archivo temporal después de enviar el correo
                os.unlink(temp_pdf_path)
                return HttpResponse('El PDF ha sido enviado por correo electrónico.')
            else:
                return HttpResponse('Error al enviar el correo electrónico.')
    else:
            return HttpResponse('Error al generar el PDF')


   
def generar_pdf(nombre_cliente, email_cliente, fecha_validez,total,cart_items):
    # Ruta de la plantilla HTML para la cotización
    template_path = 'cotizacion.html'

    # Cargar la plantilla HTML
    template = get_template(template_path)

    # Contexto de los datos para la cotización
    context = {
        'items': cart_items,
        'total': total,
        'nombre_cliente': nombre_cliente,
        'email_cliente': email_cliente,
        'fecha_validez': fecha_validez,
    }

    # Renderizar la plantilla HTML con el contexto
    html = template.render(context)

    # Convertir HTML a PDF
    pdf_file = BytesIO()
    pisa_status = pisa.CreatePDF(html.encode('UTF-8'), dest=pdf_file)

    if not pisa_status.err:
        pdf_file.seek(0)
        return pdf_file.read()
    else:
        return None

def enviar_email(destinatario, archivo_adjunto):
    # Configurar los detalles del servidor SMTP
    smtp_server = 'smtp.gmail.com'
    smtp_port = 587  # Puerto SMTP (usualmente 587 o 465 para SSL)
    smtp_user = 'joaquin.castilloh12@gmail.com'  # Correo electrónico del remitente
    smtp_password = 'nvse itqb miil tasu'  # Contraseña del correo electrónico del remitent

    # Configurar el mensaje de correo electrónico
    subject = 'Cotización adjunta'
    body = 'Adjunto encontrarás la cotización solicitada.'
    sender_email = smtp_user
    receiver_email = destinatario

    message = MIMEMultipart()
    message['From'] = sender_email
    message['To'] = receiver_email
    message['Subject'] = subject

    # Adjuntar el archivo PDF al mensaje de correo electrónico
    with open(archivo_adjunto, 'rb') as file:
        part = MIMEBase('application', 'octet-stream')
        part.set_payload(file.read())
        encoders.encode_base64(part)
        part.add_header('Content-Disposition', f'attachment; filename= {os.path.basename(archivo_adjunto)}')
        message.attach(part)

    # Establecer la conexión con el servidor SMTP y enviar el correo electrónico
    try:
        with smtplib.SMTP(smtp_server, smtp_port) as server:
            server.starttls()
            server.login(smtp_user, smtp_password)
            server.send_message(message)
        return True
    except Exception as e:
        print("Error al enviar el correo electrónico:", str(e))
        return False
