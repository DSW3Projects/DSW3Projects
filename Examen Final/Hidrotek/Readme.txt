# Hidrotek

Hidrotek es una plataforma e-commerce para una empresa que se dedica a la venta de bombas de agua. El sitio web permite a los clientes explorar una variedad de productos, agregarlos al carrito y cotizar en línea.

## Descripción

Este proyecto Django tiene como objetivo proporcionar una experiencia de cotizar en línea para los productos de Hidrotek, permitiendo a los usuarios buscar, filtrar y comprar bombas de agua de manera eficiente.

## Características

- **Catálogo de Productos**: Muestra una lista de productos disponibles con opciones de búsqueda, filtrado y paginación.
- **Carrito de Compras**: Funcionalidad para agregar productos al carrito y gestionar la compra.
- **Sistema de Usuarios**: Registro, inicio de sesión y manejo de cuentas de usuario.


## Instalación

### Requisitos Previos

- Python 3.8 o superior
- Django 3.2 o superior
- Pipenv (opcional pero recomendado para la gestión de dependencias)

### Pasos de Instalación

1. Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/hidrotek.git
    cd hidrotek
    ```

2. Crea un entorno virtual y actívalo:

    ```sh
    python -m venv env
    source env/bin/activate   # En Windows: env\Scripts\activate
    ```

3. Instala las dependencias:

    ```sh
    pip install -r requirements.txt
    ```

4. Realiza las migraciones de la base de datos:

    ```sh
    python manage.py migrate
    ```

5. Crea un superusuario para acceder al panel de administración:

    ```sh
    python manage.py createsuperuser
    ```

6. Ejecuta el servidor de desarrollo:

    ```sh
    python manage.py runserver
    ```

7. Accede a la aplicación en tu navegador:

    ```
    http://127.0.0.1:8000
    ```

## Uso

### Navegación

- **Página Principal**: Introducción a Hidrotek, con enlaces a productos destacados y últimas noticias.
- **Catálogo de Productos**: Explora la gama completa de productos con opciones para buscar y filtrar.
- **Carrito de Compras**: Gestiona los productos seleccionados para la compra.
- **Panel de Administración**: Gestiona productos, categorías y usuarios.

### Panel de Administración

Accede al panel de administración en `http://127.0.0.1:8000/admin` con las credenciales de superusuario creadas.

