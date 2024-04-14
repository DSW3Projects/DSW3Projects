/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;
import javax.swing.JOptionPane;
public class GraphicDesigner extends HalfTime {
    public GraphicDesigner(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public void designVisualMaterial() {
        
    }

    public void creativeProjectColaboration() {
        
    }

    

    public static void submitProposals() {
        String projectName = JOptionPane.showInputDialog(null, "Enter the project name:");
        String projectDescription = JOptionPane.showInputDialog(null, "Enter the project description:");
        String budgetAmountString = JOptionPane.showInputDialog(null, "Enter the project budget:");
        double budgetAmount = Double.parseDouble(budgetAmountString);
        String deadline = JOptionPane.showInputDialog(null, "Enter the deadline for the project (DD/MM/AAAA):");
        JOptionPane.showMessageDialog(null, "Proposal for the project '" + projectName + "' descrption: '" + projectDescription + "', with an estimated budget of " + budgetAmount + " has been send. Deadline: " + deadline + ".");
    }

}
