/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class AdministrativeAssistant extends HalfTime {
    public AdministrativeAssistant(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public void manageDocumentation() {
        
    }

    public void coodinateMeetings() {
        
    }

    public static void takeCalls() {
        int numCalls = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of calls:"));
        for (int i = 1; i <= numCalls; i++) {
            String urgencyLevel = JOptionPane.showInputDialog("Enter the urgency level of call " + i + " (Low, Medium, High):");
            switch (urgencyLevel.toLowerCase()) {
                case "low" -> JOptionPane.showMessageDialog(null, "Call " + i + ": This is a low priority call.");
                case "medium" -> JOptionPane.showMessageDialog(null, "Call " + i + ": This is a medium priority call.");
                case "high" -> JOptionPane.showMessageDialog(null, "Call " + i + ": This is a high priority call.");
                default -> JOptionPane.showMessageDialog(null, "Call " + i + ": Invalid urgency level.");
            }
        }
    }
}