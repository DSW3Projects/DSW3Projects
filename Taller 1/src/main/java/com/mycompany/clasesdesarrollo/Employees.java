
package com.mycompany.clasesdesarrollo;
// Clase principal Empleado

import javax.swing.JOptionPane;

public class Employees {
    public String name;
    public String id;
    public double baseSalary;
    public int hoursWorked;

    public Employees(String name, String id, double baseSalary, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }

    public static void calculateSalary(double baseSalary,int hoursWorked) {
    double salary = hoursWorked * baseSalary;
    JOptionPane.showMessageDialog(null, "The Final salary is: $" + salary);
    }
}


