/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesdesarrollo;

import javax.swing.JOptionPane;

public class DataAnalizer extends HalfTime {
    private String especialty;

    public DataAnalizer(String name, String id, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary, hoursWorked);
        this.especialty = especialty;
    }

    public static void analizeData() {
      String AmountOfData = JOptionPane.showInputDialog("Amount of data to analyze (please, in gigabytes): ");
      JOptionPane.showMessageDialog(null, "The amount of data that you are going to analize is " + AmountOfData);
    
    }

    public void generateAnalisisReports() {
        
    }

    public void developPredictiveMethods() {
        
    }
}