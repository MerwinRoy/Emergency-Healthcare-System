/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DonorRole;

//Import EcoSystem
import Business.EcoSystem;

//Import donor Organization
import Business.Organization.DonorOrg;

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import UserAccountDirectoruy
import Business.UserAccount.UserAccountDirectory;

//Import DonorWorkRequest
import Business.WorkQueue.DonorWorkReq;


//Import WorkRequest
import Business.WorkQueue.WorkRequest;

//Impoort CardLayout
import java.awt.CardLayout;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import TableModel
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradyumnareddy
 */
public class PendingRequest extends javax.swing.JPanel 

{

    //JPanel object
    private JPanel container;
    
    //Donor Organization object
    private DonorOrg donorOrg;
    
    //Organization object
    private Organization org;
    
    //EcoSystem object
    private EcoSystem ecoSystem;
    
    //userAccountDirectory object
    private UserAccountDirectory userAccountDirectory;
    
    //UserAccount object
    private UserAccount account;
    

    
    
    /**
     * Creates new form ViewPendingRequest
     */
    public PendingRequest(JPanel container, 
            UserAccount account, 
            Organization org,
            EcoSystem ecoSystem) 
    {
        //Initialize components
        
        initComponents();
        
        
        this.
                container = container;
        this.
                ecoSystem = ecoSystem;
        this.
                account = account;
        this.
                org=org;
        
        //populate table
        populateJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonationReq = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        donationREq = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setLayout(null);

        tblDonationReq.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblDonationReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonationReq);
        if (tblDonationReq.getColumnModel().getColumnCount() > 0) {
            tblDonationReq.getColumnModel().getColumn(0).setResizable(false);
            tblDonationReq.getColumnModel().getColumn(1).setResizable(false);
            tblDonationReq.getColumnModel().getColumn(2).setResizable(false);
            tblDonationReq.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 150, 600, 169);

        btnRefresh.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh);
        btnRefresh.setBounds(270, 360, 140, 30);

        btnProcess.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess);
        btnProcess.setBounds(750, 360, 140, 30);

        btnAssign.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAssign.setText("Assign Request");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign);
        btnAssign.setBounds(500, 360, 163, 30);

        donationREq.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        donationREq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donationREq.setText("DONATION REQUESTS PANEL");
        add(donationREq);
        donationREq.setBounds(360, 60, 430, 50);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 830, 60, 40);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(0, 0, 1378, 910);
    }// </editor-fold>//GEN-END:initComponents

    //function to populate table
    public void populateJTable()
    {
        {
        
            //
            DefaultTableModel tableModel = (DefaultTableModel)tblDonationReq.
                    getModel();
            tableModel.
                    setRowCount(0);
            
            //iterating through list of work request
            for(WorkRequest wr : org.
                    getWorkQueue().
                    getListOfWorkRequest())
            {
                Object[] row = new Object[4];
                
                row[0] = wr;
                
                row[1] = wr.
                        getSenderAccount().
                        getEmployee().
                        getName();
                row[2] = wr.
                        getReceiverAccount() == null ? null : wr.getReceiverAccount().
                                getEmployee().
                                getName();
                row[3] = wr.
                        getStatus();
            
                //adding row to table model after every iteration
                tableModel.
                        addRow(row);
        }
    }
    }
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //refresh table
        populateJTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        //row selected from table
        int selectedRow = tblDonationReq.
                getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.
                    showMessageDialog(null, "Please select a row fromt the table", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        DonorWorkReq donorWorkReq = (DonorWorkReq)tblDonationReq.
                getValueAt(selectedRow, 0);
        if(donorWorkReq.
                getReceiverAccount() == null)
        {
            //Warning prompt
            JOptionPane.
                    showMessageDialog(null, "Need to assign the request first", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        if(donorWorkReq.
                getStatus().
                equalsIgnoreCase("Completed"))
        {
            //Warning prompt
            JOptionPane.
                    showMessageDialog(null, "It has already been completed", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        if(donorWorkReq.
                getStatus().
                equalsIgnoreCase("Processing") ||  donorWorkReq.
                        getStatus().
                        equalsIgnoreCase("Pending"))
        {
            if(donorWorkReq.
                    getReceiverAccount()!=account)
            {
                //Warning prompt
                JOptionPane.
                        showMessageDialog(null, "It is under process currently!", "warning", JOptionPane.
                                WARNING_MESSAGE);
                return;
            }
        }
        
        //set status of donor request
        donorWorkReq.
                setStatus("Processing");
        
        //New JPanel object created
        ProcessRequestAreaJPanel processRequestAreaPanel = new ProcessRequestAreaJPanel(container, donorWorkReq, account);
        
        //container added
        container.
                add("ProcessWorkRequestJPanel", processRequestAreaPanel);
        
        //cardLayout created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //next layout loaded
        cardLayout.
                next(container);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        //Selected row from table
        int selectedRow = tblDonationReq.
                getSelectedRow();
        
        
        if (selectedRow < 0)
        {
            //warning prompt
            JOptionPane.
                    showMessageDialog(null, "Please select a row from the table", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try
        {
            
        DonorWorkReq donorWorkReq = (DonorWorkReq)tblDonationReq.
                getValueAt(selectedRow, 0);
        
        if(donorWorkReq.
                getReceiverAccount()!=null)
        {
            //warning prompt
            JOptionPane.
                    showMessageDialog(null, "Request already processed", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        //set receiver account
        donorWorkReq.
                setReceiverAccount(account);
        
        //set status as pending
        donorWorkReq.
                setStatus("Pending");
        
        //refresh table
        populateJTable();
        }
        
        catch(Exception e)
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Please assign request to Manager","Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        //Container removed
        container.remove(this);
        
        //Cardlayout object added
        CardLayout cardLayout = (CardLayout)container.getLayout();
        
        //previous container added
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel donationREq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTable tblDonationReq;
    // End of variables declaration//GEN-END:variables
}