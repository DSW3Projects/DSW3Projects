package com.mycompany.clasesdesarrollo;


import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joako
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setTitle("Employees Menu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jLabel3.setText("Base Salary");

        jLabel4.setText("Hours Worked");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FullTime", "PartTime" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Secretary", "SoftwareEngineer", "SupportTechnician" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "assignTask", "manageTeam", "makeReport" }));

        jLabel5.setText("Type of schedule");

        jLabel6.setText("Position");

        jLabel7.setText("Function");

        jButton1.setText("Execute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Final Salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jButton1)))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jButton1)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jLable1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    jComboBox2.removeAllItems();
    String seleccion = (String) jComboBox1.getSelectedItem();
    if (seleccion.equals("FullTime")) {
        jComboBox2.addItem("Manager");
        jComboBox2.addItem("Secretary");
        jComboBox2.addItem("SupportTechnician");
        jComboBox2.addItem("SoftwareEngineer");
        jComboBox2.addItem("Accountant");
        jComboBox2.addItem("SecurityAnalist");
    } else if (seleccion.equals("PartTime")) {
        jComboBox2.addItem("AdministrativeAssistant");
        jComboBox2.addItem("DataAnalizer");
        jComboBox2.addItem("FinancialAdvisor");
        jComboBox2.addItem("GraphicDesigner");
        jComboBox2.addItem("Janitor");
    }
    

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String name = jTextField1.getText();
       String ID = jTextField2.getText();
       String baseSalary= jTextField3.getText();
       String hoursWorked = jTextField4.getText();
       
       String seleccion = (String) jComboBox3.getSelectedItem();
       if (seleccion.equals("assignTask")) {
       Manager.assignTask();
       }
       else if(seleccion.equals("submitProposals")){
       GraphicDesigner.submitProposals();
       }
       else if(seleccion.equals("provideAdvice")){
       SupportTechnician.provideAdvice();
       }
       else if(seleccion.equals("developSoftware")){
       SoftwareEngineer.developSoftware();
       }
       else if(seleccion.equals("analizeData")){
        DataAnalizer.analizeData();
       }
       else if(seleccion.equals("writeCorrespondence")){
       Secretary.writeCorrespondence();
       }
       else if(seleccion.equals("prepareFinancialReports")){
       FinalcialAdvisor.prepareFinancialReports();
       }
       else if(seleccion.equals("takeCalls")){
       AdministrativeAssistant.takeCalls();
       }
       else if(seleccion.equals("requestVacation")){
       FullTime.requestVacation();
       }
       else if(seleccion.equals("requestPermision")){
       HalfTime.requestPermision();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    jComboBox3.removeAllItems();
    String seleccion = (String) jComboBox2.getSelectedItem();
        switch (seleccion) {
            case "Manager" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("assignTask");
                jComboBox3.addItem("manageTeam");
                jComboBox3.addItem("makeReport");
            }
            case "Secretary" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("manageAgenda");
                jComboBox3.addItem("writeCorrespondence");
                jComboBox3.addItem("organizeDocuments");
            }
            case "SupportTechnician" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("solveIncidents");
                jComboBox3.addItem("softwareUpdate");
                jComboBox3.addItem("provideAdvice");
            }
            case "SoftwareEngineer" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("developSoftware");
                jComboBox3.addItem("makeTest");
                jComboBox3.addItem("mantainSystems");
            }
            case "AdministrativeAssistant" -> {
                jComboBox3.addItem("requestPermision");
                jComboBox3.addItem("organizeInvetory");
                jComboBox3.addItem("attendCostumer");
                jComboBox3.addItem("manageDocumentation");
                jComboBox3.addItem("coodinateMeetings");
                jComboBox3.addItem("takeCalls");
            }
            case "DataAnalizer" -> {
                jComboBox3.addItem("requestPermision");
                jComboBox3.addItem("organizeInvetory");
                jComboBox3.addItem("attendCostumer");
                jComboBox3.addItem("analizeData");
                jComboBox3.addItem("generateAnalisisReports");
                jComboBox3.addItem("developPredictiveMethods");
            }
            case "FinancialAdvisor" -> {
                jComboBox3.addItem("requestPermision");
                jComboBox3.addItem("organizeInvetory");
                jComboBox3.addItem("attendCostumer");
                jComboBox3.addItem("adviceCostumers");
                jComboBox3.addItem("makeMarketAnalisis");
                jComboBox3.addItem("prepareFinancialReports");
            }
            case "GraphicDesigner" -> {
                jComboBox3.addItem("requestPermision");
                jComboBox3.addItem("organizeInvetory");
                jComboBox3.addItem("attendCostumer");
                jComboBox3.addItem("designVisualMaterial");
                jComboBox3.addItem("creativeProjectColaboration");
                jComboBox3.addItem("submitProposals");
            }
            case "Accountant" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("registerIncome");
                jComboBox3.addItem("registarExpenses");
                jComboBox3.addItem("auditBooks");
            }
            case "SecurityAnalist" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("securityMonitoring");
                jComboBox3.addItem("analizeVulnerabilities");
                jComboBox3.addItem("incidentDetection");
            }
            case "Janitor" -> {
                jComboBox3.addItem("requestVacation");
                jComboBox3.addItem("registerAssitant");
                jComboBox3.addItem("reciveBonus");
                jComboBox3.addItem("cleanAisles");
                jComboBox3.addItem("collectGarbage");
                jComboBox3.addItem("removeLitter");
            }
            default -> {
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double baseSalary = Double.parseDouble(jTextField3.getText());
        int hoursWorked = Integer.parseInt(jTextField4.getText());
        Employees.calculateSalary(baseSalary,hoursWorked);       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
