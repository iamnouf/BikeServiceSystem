/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeservicesystem;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author NEW
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
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
        jTextField1 = new javax.swing.JTextField();
        Text = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(414, 896));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel1.setText("Payment Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 182, 25);

        jLabel2.setText("Total Price is :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 132, 89, 16);

        jLabel3.setText("SR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(181, 132, 34, 16);

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setText("Please Enter Credit Card Information");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 261, 25);

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Name On Card");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 310, 137, 35);

        Text.setForeground(new java.awt.Color(204, 204, 204));
        Text.setText("4847 **** **** ****");
        Text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFocusLost(evt);
            }
        });
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        getContentPane().add(Text);
        Text.setBounds(40, 240, 137, 35);

        jFormattedTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedTextField1.setText("MM/YY");
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(200, 240, 101, 35);

        jFormattedTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedTextField2.setText("3-4 digit code");
        jFormattedTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField2FocusLost(evt);
            }
        });
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(200, 310, 101, 35);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("SHOW PRICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(217, 470, 160, 52);

        jLabel5.setText("Card number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 210, 81, 16);

        jLabel6.setText("Name on Card");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 290, 89, 14);

        jLabel7.setText("Expires date ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 210, 81, 16);

        jLabel8.setText("CVV Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 290, 79, 16);

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("<");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 0, 80, 90);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Settings");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 730, 120, 71);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Orders");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(120, 730, 170, 71);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Home");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 730, 120, 71);

        jTextField3.setEditable(false);
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(114, 127, 61, 26);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(217, 520, 160, 52);

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/fatima/Desktop/iPhone XR, XS Max, 11 – 13.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, 0, 410, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void TextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFocusGained
        // TODO add your handling code here:
         if (Text.getText().equals("4847 **** **** ****")) {
            Text.setText("");
            Text.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_TextFocusGained

    private void TextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFocusLost
        // TODO add your handling code here:
         if (Text.getText().equals("")) {
            Text.setText("4847 **** **** ****");
            Text.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_TextFocusLost

    private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained
        // TODO add your handling code here:
         if (jFormattedTextField1.getText().equals("MM/YY")) {
            jFormattedTextField1.setText("");
            jFormattedTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jFormattedTextField1FocusGained

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        // TODO add your handling code here:
         if (jFormattedTextField1.getText().equals("")) {
            jFormattedTextField1.setText("MM/YY");
            jFormattedTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
         if (jTextField1.getText().equals("Name On Card")) {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
          if (jTextField1.getText().equals("")) {
            jTextField1.setText("Name On Card");
            jTextField1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jFormattedTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField2FocusGained
        // TODO add your handling code here:
        if (jFormattedTextField2.getText().equals("3-4 digit code")) {
            jFormattedTextField2.setText("");
            jFormattedTextField2.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jFormattedTextField2FocusGained

    private void jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField2FocusLost
        // TODO add your handling code here:
        if (jFormattedTextField2.getText().equals("")) {
            jFormattedTextField2.setText("3-4 digit code");
            jFormattedTextField2.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_jFormattedTextField2FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                jTextField3.setText(RentBike.price.toString());  

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RentBike back = new RentBike ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Settings back = new Settings ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ViewOrder back = new ViewOrder ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MainInterface back = new MainInterface ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            // TODO add your handling code here:
            String CardNumber = Text.getText();
            String date = jFormattedTextField1.getText();
            String name = jTextField1.getText();
            String cvv = jFormattedTextField2.getText();
            SimpleDateFormat df = new SimpleDateFormat("MM/yy");

            String LowUpperCase = "(.*[a-zA-Z].*)";
            String numbers = "(.*[0-9].*)";
 
        String ePattern = "\\d{2}/\\d{2}";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher dates = p.matcher(date);
        
            if(CardNumber.matches(numbers) &&CardNumber.length()==16 && dates.matches()&& name.matches(LowUpperCase)
                    && cvv.matches(numbers) && (cvv.length()==3||cvv.length()==4)){
                Thanku back = new Thanku ();
                back.setVisible(true); 
            }else if(!CardNumber.matches(numbers) &&CardNumber.length()!=16){
                                JOptionPane.showMessageDialog(null, "Invalid Card Number Detalis !" );

            }else if (!dates.matches()){
                                JOptionPane.showMessageDialog(null, "Enter Date in this format MM/yy !" );

            }else if(!name.matches(LowUpperCase)){
                                JOptionPane.showMessageDialog(null, "Invalid Name Detalis !" );

            }else if(!cvv.matches(numbers) && (cvv.length()!=3||cvv.length()!=4)){
                                JOptionPane.showMessageDialog(null, "Invalid CVV Detalis !" );

            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Payment Detalis !" );
                
            }
       
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
