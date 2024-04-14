/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;
 import javax.swing.JOptionPane;
public class SupportTechnician extends FullTime {
    public SupportTechnician(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public void solveIncidents() {
        
    }

    public void softwareUpdate() {
        
    }

  

    public static void provideAdvice() {
        String problemDescription = JOptionPane.showInputDialog(null, "Describe your problem:");
        String adviceMessage = "If you find yourself lost at sea, try swimming to dry land. Good luck!";
        JOptionPane.showMessageDialog(null, adviceMessage, "Advice", JOptionPane.INFORMATION_MESSAGE);
}

}