/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class Secretary extends FullTime {
    private String agenda;

    public Secretary(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
        this.agenda = agenda;
    }

    public static void manageAgenda() {
        
    }

    public static void writeCorrespondence() {
        String recipient = JOptionPane.showInputDialog("Enter the recipient's name:");
        String subject = JOptionPane.showInputDialog("Enter the subject:");
        String message = JOptionPane.showInputDialog("Enter the message:");
        JOptionPane.showMessageDialog(null, """
                                            The correspondence has been written:
                                            Recipient: """ + recipient + "\n" +
                                            "Subject: " + subject + "\n" +
                                            "Message: " + message);
    }

    public void organizeDocuments() {
        
    }
}
