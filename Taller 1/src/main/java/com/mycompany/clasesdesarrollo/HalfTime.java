/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class HalfTime extends Employees {
    public HalfTime(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public static void requestPermision() {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to request permission to leave work?", "Permission Request", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Your request has been sent. Please wait for supervisor confirmation.");
        } else {
            JOptionPane.showMessageDialog(null, "Permission request cancelled.");
        }
    }

    public void organizeInvetory() {
        
    }

    public void attendCostumer() {
        
    }
}
