/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;
import javax.swing.JOptionPane;
/**
 *
 * @author Joaquin
 */

public class FullTime extends Employees {
    public FullTime(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public void requestVacation(String name) {
     this.name = name;   
    String startDate = JOptionPane.showInputDialog(null, "Ingrese la fecha de inicio de sus vacaciones (DD/MM/AAAA):");   
    String endDate = JOptionPane.showInputDialog(null, "Ingrese la fecha de finalización de sus vacaciones (DD/MM/AAAA):");
    JOptionPane.showMessageDialog(null, "Solicitud de vacaciones enviada para " + name + " del " + startDate + " al " + endDate + ".");
        
    }

    public void registerAssitant() {
    
    }

    public void reciveBonus() {
        
    }
}

