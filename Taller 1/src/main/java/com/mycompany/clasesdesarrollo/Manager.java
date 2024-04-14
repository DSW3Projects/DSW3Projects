/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;
import javax.swing.JOptionPane;
public class Manager extends FullTime {
    private String department;

    public Manager(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
        this.department = department;
    }   

    

    public static void assignTask() {
    String taskName = JOptionPane.showInputDialog(null, "Enter task name:");
    String taskDescription = JOptionPane.showInputDialog(null, "Enter task description:");
    String employeeName = JOptionPane.showInputDialog(null, "Enter the employee name that the task is assign:");
    JOptionPane.showMessageDialog(null, "The task '" + taskName + "' with the description  '" + taskDescription + "' has been assinged to  " + employeeName + ".");
}


    public void manageTeam() {
        
    }

    public void makeReport() {
        
    }
}
