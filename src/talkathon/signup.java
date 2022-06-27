/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package talkathon;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author root
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        signNameFirst.setBackground(new java.awt.Color(0,0,0,1));
        signNameLast.setBackground(new java.awt.Color(0,0,0,1));
        signEmail.setBackground(new java.awt.Color(0,0,0,1));
        signPhone.setBackground(new java.awt.Color(0,0,0,1));
        signPass.setBackground(new java.awt.Color(0,0,0,1));
        signConfirmPass.setBackground(new java.awt.Color(0,0,0,1));
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
        txtAbout = new javax.swing.JLabel();
        txtTerms = new javax.swing.JLabel();
        txtBlog = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        signNameFirst = new javax.swing.JTextField();
        signNameLast = new javax.swing.JTextField();
        signEmail = new javax.swing.JTextField();
        signPhone = new javax.swing.JTextField();
        signPass = new javax.swing.JPasswordField();
        signConfirmPass = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(764, 414));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Talkathon");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantarell Light", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Let's Sign up");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("Glad to see you");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        txtAbout.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        txtAbout.setForeground(new java.awt.Color(102, 102, 102));
        txtAbout.setText("About");
        getContentPane().add(txtAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 22, -1, -1));

        txtTerms.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        txtTerms.setForeground(new java.awt.Color(102, 102, 102));
        txtTerms.setText("Terms");
        getContentPane().add(txtTerms, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 22, -1, -1));

        txtBlog.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        txtBlog.setForeground(new java.awt.Color(102, 102, 102));
        txtBlog.setText("Blog");
        getContentPane().add(txtBlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 22, -1, -1));

        loginButton.setBackground(new java.awt.Color(153, 102, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log in");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("UserName :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Full Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Email :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Phone :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Confirm Password :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 102, 255));
        jLabel13.setText("________________________");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 102, 255));
        jLabel14.setText("________________________");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 102, 255));
        jLabel15.setText("________________________");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 102, 255));
        jLabel16.setText("________________________");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 102, 255));
        jLabel17.setText("________________________");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel18.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 102, 255));
        jLabel18.setText("________________________");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        signNameFirst.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signNameFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 191, 190, 21));

        signNameLast.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signNameLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 191, 190, 21));

        signEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 251, 190, 21));

        signPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 251, 190, 21));

        signPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 312, 190, 21));

        signConfirmPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(signConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 312, 190, 21));

        signupButton.setBackground(new java.awt.Color(153, 102, 255));
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Project Talkathon\\ChattingApp\\src\\talkathon\\signup\\mail (3).png")); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 201, 150));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Project Talkathon\\ChattingApp\\src\\talkathon\\signup\\New Project.png")); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 550, 270));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Project Talkathon\\ChattingApp\\src\\talkathon\\signup\\background (2).png")); // NOI18N
        jLabel21.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jLabel21HierarchyChanged(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel21HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21HierarchyChanged

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        login newlogin = new login();
        newlogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonMouseClicked

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            String newName = signNameFirst.getText().trim();
            String newPass = signPass.getText().trim();
            String newFullName = signNameLast.getText().trim();
            String newPhone = signPhone.getText();
            String newEmail = signEmail.getText();
            String newConfirmPass = signConfirmPass.getText();
            if(newName.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter UserName");
            }
            else if(newFullName.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Name");
            }
            else if(newPhone.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Phone Number");
            }
            else if(newEmail.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Email Address");
            }
            else if(newPass.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Password");
            }
            else if(newConfirmPass.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Password");
            }
            else if(newPass.equals(newConfirmPass))
            {
                Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/talkathon","root","77808");
            Statement st = con.createStatement();
            st.execute("insert into talkathonlogin values ('"+newName+"','"+newPass+"')");
            st.execute("insert into talkathonsignin values ('"+newFullName+"','"+newPhone+"','"+newEmail+"')");
            login newlogin = new login();
            newlogin.setVisible(true);
            this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Passwords Doesn't Match");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_signupButtonActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField signConfirmPass;
    private javax.swing.JTextField signEmail;
    private javax.swing.JTextField signNameFirst;
    private javax.swing.JTextField signNameLast;
    private javax.swing.JPasswordField signPass;
    private javax.swing.JTextField signPhone;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel txtAbout;
    private javax.swing.JLabel txtBlog;
    private javax.swing.JLabel txtTerms;
    // End of variables declaration//GEN-END:variables
}
