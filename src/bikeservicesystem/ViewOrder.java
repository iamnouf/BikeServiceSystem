/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeservicesystem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NEW
 */
public class ViewOrder extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrder
     */
    public ViewOrder() {
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

        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(414, 896));
        getContentPane().setLayout(null);

        jTextField23.setEditable(false);
        jTextField23.setForeground(new java.awt.Color(51, 51, 51));
        jTextField23.setText("State");
        getContentPane().add(jTextField23);
        jTextField23.setBounds(220, 290, 90, 26);

        jTextField24.setEditable(false);
        jTextField24.setForeground(new java.awt.Color(51, 51, 51));
        jTextField24.setText("State");
        getContentPane().add(jTextField24);
        jTextField24.setBounds(220, 320, 90, 26);

        jTextField19.setEditable(false);
        jTextField19.setForeground(new java.awt.Color(51, 51, 51));
        jTextField19.setText("State");
        getContentPane().add(jTextField19);
        jTextField19.setBounds(220, 170, 90, 26);

        jTextField20.setEditable(false);
        jTextField20.setForeground(new java.awt.Color(51, 51, 51));
        jTextField20.setText("State");
        getContentPane().add(jTextField20);
        jTextField20.setBounds(220, 200, 90, 26);

        jTextField21.setEditable(false);
        jTextField21.setForeground(new java.awt.Color(51, 51, 51));
        jTextField21.setText("State");
        getContentPane().add(jTextField21);
        jTextField21.setBounds(220, 230, 90, 26);

        jTextField26.setEditable(false);
        jTextField26.setForeground(new java.awt.Color(51, 51, 51));
        jTextField26.setText("State");
        getContentPane().add(jTextField26);
        jTextField26.setBounds(220, 380, 90, 26);

        jTextField22.setEditable(false);
        jTextField22.setForeground(new java.awt.Color(51, 51, 51));
        jTextField22.setText("State");
        getContentPane().add(jTextField22);
        jTextField22.setBounds(220, 260, 90, 26);

        jTextField25.setEditable(false);
        jTextField25.setForeground(new java.awt.Color(51, 51, 51));
        jTextField25.setText("State");
        getContentPane().add(jTextField25);
        jTextField25.setBounds(220, 350, 90, 26);

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

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Settings");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 730, 120, 71);

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(320, 260, 86, 29);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Orders");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 50, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 130, 40, 17);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("State");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 130, 50, 17);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Manage");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 130, 60, 17);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 230, 86, 29);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 170, 86, 29);

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 200, 86, 29);

        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(320, 350, 86, 29);

        jButton10.setText("Cancel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(320, 320, 86, 29);

        jButton11.setText("Cancel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(320, 290, 86, 29);

        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("Service Type");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 230, 90, 26);

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("Service Type");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(10, 170, 90, 26);

        jTextField3.setEditable(false);
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setText("Service Type");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(10, 200, 90, 26);

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setText("Service Type");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(10, 260, 90, 26);

        jTextField5.setEditable(false);
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.setText("Service Type");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(10, 290, 90, 26);

        jTextField6.setEditable(false);
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jTextField6.setText("Service Type");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(10, 320, 90, 26);

        jTextField7.setEditable(false);
        jTextField7.setForeground(new java.awt.Color(51, 51, 51));
        jTextField7.setText("Service Type");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(10, 350, 90, 26);

        jTextField8.setEditable(false);
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setText("Service Type");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(10, 380, 90, 26);

        jTextField10.setEditable(false);
        jTextField10.setForeground(new java.awt.Color(51, 51, 51));
        jTextField10.setText("dd/MM/yy");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(110, 170, 90, 26);

        jTextField11.setEditable(false);
        jTextField11.setForeground(new java.awt.Color(51, 51, 51));
        jTextField11.setText("dd/MM/yy");
        getContentPane().add(jTextField11);
        jTextField11.setBounds(110, 200, 90, 26);

        jTextField12.setEditable(false);
        jTextField12.setForeground(new java.awt.Color(51, 51, 51));
        jTextField12.setText("dd/MM/yy");
        getContentPane().add(jTextField12);
        jTextField12.setBounds(110, 230, 90, 26);

        jTextField13.setEditable(false);
        jTextField13.setForeground(new java.awt.Color(51, 51, 51));
        jTextField13.setText("dd/MM/yy");
        getContentPane().add(jTextField13);
        jTextField13.setBounds(110, 260, 90, 26);

        jTextField14.setEditable(false);
        jTextField14.setForeground(new java.awt.Color(51, 51, 51));
        jTextField14.setText("dd/MM/yy");
        getContentPane().add(jTextField14);
        jTextField14.setBounds(110, 290, 90, 26);

        jTextField15.setEditable(false);
        jTextField15.setForeground(new java.awt.Color(51, 51, 51));
        jTextField15.setText("dd/MM/yy");
        getContentPane().add(jTextField15);
        jTextField15.setBounds(110, 320, 90, 26);

        jTextField16.setEditable(false);
        jTextField16.setForeground(new java.awt.Color(51, 51, 51));
        jTextField16.setText("dd/MM/yy");
        getContentPane().add(jTextField16);
        jTextField16.setBounds(110, 350, 90, 26);

        jTextField17.setEditable(false);
        jTextField17.setForeground(new java.awt.Color(51, 51, 51));
        jTextField17.setText("dd/MM/yy");
        getContentPane().add(jTextField17);
        jTextField17.setBounds(110, 380, 90, 26);

        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(320, 380, 86, 29);

        jButton8.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(267, 520, 120, 50);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Orders");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 30, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/fatima/Desktop/iPhone XR, XS Max, 11 – 13.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Settings back = new Settings ();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
          if (jButton2.isEnabled()) {
            jTextField2.setText(null);
            jTextField10.setText(null);
            jTextField19.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
             if (jButton4.isEnabled()) {
            jTextField3.setText(null);
            jTextField11.setText(null);
            jTextField20.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             if (jButton1.isEnabled()) {
            jTextField1.setText(null);
            jTextField12.setText(null);
            jTextField21.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
             if (jButton7.isEnabled()) {
            jTextField4.setText(null);
            jTextField13.setText(null);
            jTextField22.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
             if (jButton11.isEnabled()) {
            jTextField5.setText(null);
            jTextField14.setText(null);
            jTextField23.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
             if (jButton10.isEnabled()) {
            jTextField6.setText(null);
            jTextField15.setText(null);
            jTextField24.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
             if (jButton9.isEnabled()) {
            jTextField7.setText(null);
            jTextField16.setText(null);
            jTextField25.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
             if (jButton12.isEnabled()) {
            jTextField8.setText(null);
            jTextField17.setText(null);
            jTextField26.setText("Cancelled");

            JOptionPane.showMessageDialog(null, "Your order has been cancelled !");

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
              ArrayList<String> fileList = new ArrayList<>();

        try {
            Scanner read = new Scanner(new File("RentInfo.txt"));
            Scanner sc = new Scanner(new File("fixBikefile.txt"));
            //  String line;
            while (read.hasNext()) {
                String [] line = read.nextLine().split(" ");
                fileList.add(line[0]);
                jTextField2.setText(fileList.get(0));
                jTextField10.setText(RentBike.Date.getText());
                jTextField19.setText("Process");
                
                jTextField1.setText(fileList.get(0));
                jTextField12.setText(RentBike.Date.getText());
                jTextField21.setText("Process");
                
                jTextField5.setText(fileList.get(0));
                jTextField14.setText(RentBike.Date.getText());
                jTextField23.setText("Process");
                
                jTextField7.setText(fileList.get(0));
                jTextField16.setText(RentBike.Date.getText());
                jTextField25.setText("Process");
               
            //  String line;
                String [] line2 = sc.nextLine().split(" ");
                fileList.add(line2[0]);

                jTextField3.setText(fileList.get(0) );
                jTextField11.setText(FixBike.Date.getText());
                jTextField20.setText("Process");

                jTextField4.setText(fileList.get(0) );
                jTextField13.setText(FixBike.Date.getText());
                jTextField22.setText("Process");
                
                jTextField6.setText(fileList.get(0) );
                jTextField15.setText(FixBike.Date.getText());
                jTextField24.setText("Process");
                
                jTextField8.setText(fileList.get(0) );
                jTextField17.setText(FixBike.Date.getText());
                jTextField26.setText("Process");
            

               
            }
                            read.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
