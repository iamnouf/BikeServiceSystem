/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeservicesystem;

import java.awt.Color;
import bikeservicesystem.Welcome;
/**
 *
 * @author NEW
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        boxnum = new javax.swing.JComboBox<>();
        PhoneNumber = new javax.swing.JTextField();
        dd = new javax.swing.JComboBox<>();
        mm = new javax.swing.JComboBox<>();
        yy = new javax.swing.JComboBox<>();
        Language = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RegNext = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(414, 896));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel1.setText("Create an account");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 140, 157, 22);

        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 68, 16);

        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 200, 66, 16);

        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 260, 34, 16);

        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 310, 59, 16);

        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 380, 92, 16);

        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 450, 79, 16);

        jLabel8.setText("Language");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 510, 60, 16);

        Fname.setForeground(new java.awt.Color(204, 204, 204));
        Fname.setText("First Name");
        Fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FnameFocusLost(evt);
            }
        });
        getContentPane().add(Fname);
        Fname.setBounds(30, 220, 130, 26);

        Lname.setForeground(new java.awt.Color(204, 204, 204));
        Lname.setText("Last Name");
        Lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LnameFocusLost(evt);
            }
        });
        getContentPane().add(Lname);
        Lname.setBounds(170, 220, 130, 26);

        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("someone@example.com");
        email.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                emailHierarchyChanged(evt);
            }
        });
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(30, 280, 180, 26);

        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setText("***************");
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(30, 330, 180, 26);

        boxnum.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        boxnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+966", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxnum);
        boxnum.setBounds(30, 400, 79, 27);

        PhoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        PhoneNumber.setText("5xxxxxxxx");
        PhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneNumberFocusLost(evt);
            }
        });
        getContentPane().add(PhoneNumber);
        PhoneNumber.setBounds(110, 400, 193, 26);

        dd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dd);
        dd.setBounds(30, 470, 61, 27);

        mm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novmber", "December" }));
        getContentPane().add(mm);
        mm.setBounds(100, 470, 101, 27);

        getContentPane().add(yy);
        yy.setBounds(200, 470, 71, 27);

        Language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engilsh", "Arabic" }));
        getContentPane().add(Language);
        Language.setBounds(30, 530, 180, 27);

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 200, 14, 16);

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 200, 6, 16);

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 260, 6, 16);

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(90, 310, 6, 16);

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 380, 6, 16);

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 450, 6, 16);

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(100, 510, 6, 16);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Containing nymber,character,and symbol");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 360, 157, 10);

        RegNext.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        RegNext.setText("Register");
        RegNext.setPreferredSize(new java.awt.Dimension(414, 896));
        RegNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNextActionPerformed(evt);
            }
        });
        getContentPane().add(RegNext);
        RegNext.setBounds(270, 620, 108, 49);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("<");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 90);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel17.setText("Register");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(160, 40, 70, 22);

        jLabel18.setIcon(new javax.swing.ImageIcon("/Users/fatima/Desktop/iPhone XR, XS Max, 11 – 3.png")); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 410, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusGained
        // TODO add your handling code here:
               if(Fname.getText().equals("First Name"))
        {
            Fname.setText("");
            Fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FnameFocusGained

    private void FnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FnameFocusLost
        // TODO add your handling code here:
               if(Fname.getText().equals(""))
        {
            Fname.setText("First Name");
            Fname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FnameFocusLost

    private void LnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusGained
        // TODO add your handling code here:
                if(Lname.getText().equals("Last Name"))
        {
            Lname.setText("");
            Lname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_LnameFocusGained

    private void LnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LnameFocusLost
        // TODO add your handling code here:
                if(Lname.getText().equals(""))
        {
            Lname.setText("Last Name");
            Lname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_LnameFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
              if(email.getText().equals("someone@example.com"))
        {
            email.setText("");
            email.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_emailHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_emailHierarchyChanged

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
              if(email.getText().equals(""))
        {
            email.setText("someone@example.com");
            email.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailFocusLost

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
        if(Password.getText().equals("***************"))
        {
            Password.setText("");
            Password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_PasswordFocusGained

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:
        if(Password.getText().equals(""))
        {
            Password.setText("***************");
            Password.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_PasswordFocusLost

    private void PhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFocusGained
        // TODO add your handling code here:
                          if(PhoneNumber.getText().equals("5xxxxxxxx"))
        {
            PhoneNumber.setText("");
            PhoneNumber.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_PhoneNumberFocusGained

    private void PhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFocusLost
        // TODO add your handling code here:
                               if(PhoneNumber.getText().equals(""))
        {
            PhoneNumber.setText("5xxxxxxxx");
            PhoneNumber.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_PhoneNumberFocusLost

    private void RegNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNextActionPerformed
        // TODO add your handling code here:
         MainInterface next = new MainInterface ();
        next.setVisible(true);
    }//GEN-LAST:event_RegNextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Welcome back = new Welcome ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JComboBox<String> Language;
    private javax.swing.JTextField Lname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton RegNext;
    private javax.swing.JComboBox<String> boxnum;
    private javax.swing.JComboBox<String> dd;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mm;
    private javax.swing.JComboBox<String> yy;
    // End of variables declaration//GEN-END:variables
}
