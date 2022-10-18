/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DonorRole;

//Import CardLayout
import java.awt.CardLayout;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import Organization
import Business.Organization.Organization;

//Import Ecosystem
import Business.EcoSystem;

//Import Enterprise
import Business.Enterprise.Enterprise;


//Import Useraccount
import Business.UserAccount.UserAccount;



/**
 *
 * @author pradyumnareddy
 */

public class DonorWorkAreaJPanel extends javax.swing.JPanel 

{

    //JPanel object
    private JPanel container;
    
    //account object
    private UserAccount account;
    
    //organization object
    private Organization org;
    
    //ecosystem object
    private EcoSystem ecoSystem;
    
    //enterprise object
    private Enterprise enterprise;
    
    /**
     * Creates new form DonorWorkAreaJPanel
     */
    
    //Constructor
    public DonorWorkAreaJPanel(JPanel container, 
            UserAccount account, 
            Organization org, 
            Enterprise enterprise, 
            EcoSystem ecoSystem) 
    {
        
        //Initialize components
        initComponents();
        
        
        this.
                container = container;
        this.
                account = account;
        this.
                org = org;
        this.
                ecoSystem = ecoSystem;
        this.
                enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdateProfile = new javax.swing.JButton();
        btnCreateProfile = new javax.swing.JButton();
        btnDonationHistory = new javax.swing.JButton();
        lblDonorWorkArea = new javax.swing.JLabel();
        btnDonationReq = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdateProfile.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnUpdateProfile.setText("Update Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });
        add(btnUpdateProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 290, 70));

        btnCreateProfile.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });
        add(btnCreateProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 290, 70));

        btnDonationHistory.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnDonationHistory.setText("Donation History");
        btnDonationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationHistoryActionPerformed(evt);
            }
        });
        add(btnDonationHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 290, 70));

        lblDonorWorkArea.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblDonorWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonorWorkArea.setText("Donor Work Area");
        add(lblDonorWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 320, 60));

        btnDonationReq.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnDonationReq.setText("Donation Requests");
        btnDonationReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationReqActionPerformed(evt);
            }
        });
        add(btnDonationReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 290, 70));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1680, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed

        //ViewDonorJPanel object created
        ViewDonorJPanel viewPanel = new ViewDonorJPanel(container, account);
        
        //container added
        container.
                add("ViewDonorJPanel", viewPanel);
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next container loaded
        cardLayout.next(container);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        
        //CreateDonorProfileJPanel object created
        AddDonorProfileJPanel createPanel = new AddDonorProfileJPanel(container, account);
        
        //container added
        container.
                add("CreateDonorProfileJPanel", createPanel);
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next layout entered
        cardLayout.next(container);
    }//GEN-LAST:event_btnCreateProfileActionPerformed

    private void btnDonationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationHistoryActionPerformed
        
        if(account.
                getWorkQueue().
                getListOfWorkRequest().
                isEmpty())
        {
            //Prompts error message
            JOptionPane.
                    showMessageDialog(null, "There are no donations yet","warning",JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        //ViewDonationHistory object created
        DonationHistory viewDonationHistory = new DonationHistory(container, account);
        
        //container added
        container.
                add("ViewDonationHistory", viewDonationHistory);
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //next layout loaded
        cardLayout.
                next(container);
    }//GEN-LAST:event_btnDonationHistoryActionPerformed

    private void btnDonationReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationReqActionPerformed
       
        //ViewPendingRequest object created
        PendingRequest viewPendingRequest = new PendingRequest(container, account, org, ecoSystem);
        
        //new container added
        container.
                add("ViewPendingRequest", viewPendingRequest);
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //next layout loaded
        cardLayout.
                next(container);
    }//GEN-LAST:event_btnDonationReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JButton btnDonationHistory;
    private javax.swing.JButton btnDonationReq;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JLabel lblDonorWorkArea;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}