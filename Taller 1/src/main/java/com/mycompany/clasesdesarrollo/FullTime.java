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

    public static void requestVacation() {   
    String startDate = JOptionPane.showInputDialog(null, "Enter the initial date for vacation in this format (DD/MM/AAAA):");   
    String endDate = JOptionPane.showInputDialog(null, "Enter the final date for vacation in this format (DD/MM/AAAA):");
    JOptionPane.showMessageDialog(null, "Vacation request from " + startDate + " to " + endDate + ".");
        
    }

    public void registerAssitant() {
    
    }

    public void reciveBonus() {
        
    }
}

