

package ui.AdminRole;

//Import Enterprise
import Business.Enterprise.Enterprise;



//Import JPanel
import javax.swing.JPanel;

//Import Cardlayout
import java.awt.CardLayout;

/**
 *
 * @author  raj
 */


public class AdminWorkAreaJPanel extends javax.swing.JPanel 

{
    //Enterprise object
    Enterprise enterprise;
    
    //JPanel object
    JPanel container;
    
    /** Creates new form AdminWorkAreaJPanel */
    
    public AdminWorkAreaJPanel(JPanel container,
            Enterprise enterprise) 
            
    {
        //Initialize components
        initComponents();
        this.
                enterprise = enterprise;
        
        this.
                container = container;
        
        //Set the text of label to current enterprise
        lblvalue.setText(enterprise.
                getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        lblvalue = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitle.setText("Administrator Work Area Panel");
        add(lblTitle);
        lblTitle.setBounds(340, 30, 550, 60);

        btnManageUser.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnManageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_manage-user.png"))); // NOI18N
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });
        add(btnManageUser);
        btnManageUser.setBounds(450, 600, 200, 90);

        btnManageEmp.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnManageEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_manage-employee.png"))); // NOI18N
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });
        add(btnManageEmp);
        btnManageEmp.setBounds(450, 410, 190, 90);

        btnManageOrg.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        btnManageOrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_manage-organization.png"))); // NOI18N
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg);
        btnManageOrg.setBounds(450, 230, 200, 90);

        lblEnterprise.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEnterprise.setText("EnterPrise :");
        add(lblEnterprise);
        lblEnterprise.setBounds(430, 130, 210, 50);

        lblvalue.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblvalue.setText("<value>");
        add(lblvalue);
        lblvalue.setBounds(650, 140, 190, 30);

        lblImage.setBackground(new java.awt.Color(153, 153, 255));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(0, -80, 1610, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        
        //New Manage USer account panel object created
        UserAccountManagementJpanel manageUserPanel = new UserAccountManagementJpanel(container, enterprise);
        
        //container added to panel
        container.add("ManageUserAccountJPanel", manageUserPanel);

        //Cardlayout object created
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //next cardlayout is loaded
        cardLayout.next(container);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed

        //New EmployeeManagementJPanel object created
        EmployeeManagementJPanel mEmpPanel = new EmployeeManagementJPanel(container, enterprise.getOrganizationDirectory());
        
        //container added to panel
        container.add("manageEmployeeJPanel", mEmpPanel);

        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //next layout is loaded 
        cardLayout.
                next(container);
        
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed

        //New OrganizationManagementJPanel object is created
        OrganizationManagementJPanel manageOrgPanel = new OrganizationManagementJPanel(container, enterprise.getOrganizationDirectory());
        
        //Panel added to container
        container.
                add("manageOrganizationJPanel", manageOrgPanel);
        
        //CardLayout object is created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //Next layout is added
        cardLayout.
                next(container);
    }//GEN-LAST:event_btnManageOrgActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblvalue;
    // End of variables declaration//GEN-END:variables
    
}
