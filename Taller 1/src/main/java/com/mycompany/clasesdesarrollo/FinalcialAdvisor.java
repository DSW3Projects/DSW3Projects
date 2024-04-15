/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class FinalcialAdvisor extends HalfTime {
    public FinalcialAdvisor(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
    }

    public void adviceCostumers() {
        
    }

    public void makeMarketAnalisis() {
        
    }

    public static void prepareFinancialReports() {
        double revenue = Double.parseDouble(JOptionPane.showInputDialog("Enter total revenue:"));
        double expenses = Double.parseDouble(JOptionPane.showInputDialog("Enter total expenses:"));
        double profit = revenue - expenses;
        JOptionPane.showMessageDialog(null, "Profit: $" + profit);
    }

}
