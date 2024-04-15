/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class SoftwareEngineer extends FullTime {
    public SoftwareEngineer(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }
    
     public static void developSoftware() {
        String ide = JOptionPane.showInputDialog("Please indicate the IDE used by the Software Engineer: ");
        String repository = JOptionPane.showInputDialog("The repository too: ");
        JOptionPane.showMessageDialog(null, "IDE: " + ide + "\nRepository: " + repository);
    }

    public void makeTest() {
        
    }

    public void mantainSystems() {
        
    }
}
