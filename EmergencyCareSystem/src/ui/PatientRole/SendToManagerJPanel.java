/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Validation.Checker_Main;
import Business.WorkQueue.ManagementWorkReq;
import java.awt.CardLayout;

import Business.Organization.ManagementOrg;
import Business.UserAccount.UserAccount;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raj
 */
public class SendToManagerJPanel extends javax.swing.JPanel 

{

    /**
     * Creates new form SendToManagerJPanel
     */
     private JPanel container;
    private Enterprise enterprise;
    private UserAccount account;
    EcoSystem ecoSystem;
    
    private ManagementOrg managementOrganization;
    
    SendToManagerJPanel(JPanel userProcessContainer,
            UserAccount account,
            Enterprise enterprise,
            EcoSystem ecoSystem) 
    {
        initComponents();
        this.
                container = container;
        this.
                account = account;
        this.
                ecoSystem=ecoSystem;
        
        this.
                enterprise = enterprise;
        
        
        lblValue.
                setText(enterprise.
                        getName());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValue = new javax.swing.JLabel();
        btnRequestTest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValue.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 158, 26));

        btnRequestTest.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRequestTest.setText("Request Test");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });
        add(btnRequestTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        lblMessage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMessage.setText("Enter Message:");
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 231, 130, 30));

        txtMessage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 190, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 60, 40));

        lblEnterprise.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEnterprise.setText("ENTERPRISE:");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, 30));

        lblImage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed

        String message = txtMessage.
                getText();
        
        if( txtMessage.
                getText().
                trim().
                isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
            return;
        }
        ManagementWorkReq managementRequest = new ManagementWorkReq();
        managementRequest.
                setStatus("Sent");
        
        managementRequest.
                setMessage(message);
        
        managementRequest.
                setSenderAccount(account);
        

        managementOrganization =  Checker_Main.
                getManagerOrg(ecoSystem, account);
        
        managementOrganization.
                getWorkQueue().
                getListOfWorkRequest().
                add(managementRequest);
        
        account.
                getWorkQueue().
                getListOfWorkRequest().
                add(managementRequest);
        
        JOptionPane.
                showMessageDialog(null, "Request Send to Manager for Approval", "warning", JOptionPane.
                        WARNING_MESSAGE);
            

    }//GEN-LAST:event_btnRequestTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        container.
                remove(this);
        Component[] compArray = container.
                getComponents();
        
        Component comp = compArray[compArray.
                length - 1];
        
        RequestManagerJPanel rmPanel = (RequestManagerJPanel) comp;
        
        rmPanel.
                populateRequestTable();
        
        CardLayout cardLayout = (CardLayout)container.
                getLayout();
        
        cardLayout.
                previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
