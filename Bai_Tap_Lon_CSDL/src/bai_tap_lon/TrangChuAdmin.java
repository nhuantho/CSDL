/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import static bai_tap_lon.CSDL.jdbcConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nhuan's computer
 */
public class TrangChuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuAdmin
     */
    public TrangChuAdmin() {
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

        trangchu = new javax.swing.JButton();
        loikhuyen = new javax.swing.JButton();
        trungtam = new javax.swing.JButton();
        lstungtam = new javax.swing.JButton();
        lsloikhuyen = new javax.swing.JButton();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ quản trị viên");

        trangchu.setBackground(new java.awt.Color(255, 102, 0));
        trangchu.setForeground(new java.awt.Color(255, 255, 255));
        trangchu.setText("Trang chủ");

        loikhuyen.setBackground(new java.awt.Color(255, 102, 0));
        loikhuyen.setForeground(new java.awt.Color(255, 255, 255));
        loikhuyen.setText("Thêm lời khuyên");
        loikhuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loikhuyenActionPerformed(evt);
            }
        });

        trungtam.setBackground(new java.awt.Color(255, 102, 0));
        trungtam.setForeground(new java.awt.Color(255, 255, 255));
        trungtam.setText("Thêm trung tâm");
        trungtam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trungtamActionPerformed(evt);
            }
        });

        lstungtam.setBackground(new java.awt.Color(255, 102, 0));
        lstungtam.setForeground(new java.awt.Color(255, 255, 255));
        lstungtam.setText("Lịch sử thêm trung tâm");
        lstungtam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstungtamActionPerformed(evt);
            }
        });

        lsloikhuyen.setBackground(new java.awt.Color(255, 102, 0));
        lsloikhuyen.setForeground(new java.awt.Color(255, 255, 255));
        lsloikhuyen.setText("Lịch sử thêm lời khuyên");
        lsloikhuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsloikhuyenActionPerformed(evt);
            }
        });

        thoat.setBackground(new java.awt.Color(255, 102, 0));
        thoat.setForeground(new java.awt.Color(255, 255, 255));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loikhuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trungtam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lstungtam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lsloikhuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(loikhuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trungtam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lstungtam, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lsloikhuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ấn welcome để trở về welcome
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        Welcome wel = new Welcome();
        wel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void lstungtamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstungtamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstungtamActionPerformed

    private void lsloikhuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsloikhuyenActionPerformed
        LSThemLoiKhuyen T = new LSThemLoiKhuyen();
        T.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lsloikhuyenActionPerformed

    private void trungtamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trungtamActionPerformed
        // TODO add your handling code here:
        Them_Trung_Tam them=new Them_Trung_Tam();
        them.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trungtamActionPerformed

    private void loikhuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loikhuyenActionPerformed
        // TODO add your handling code here:
        Nhap_Loi_Khuyen them=new Nhap_Loi_Khuyen();
        them.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loikhuyenActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdmin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loikhuyen;
    private javax.swing.JButton lsloikhuyen;
    private javax.swing.JButton lstungtam;
    private javax.swing.JButton thoat;
    private javax.swing.JButton trangchu;
    private javax.swing.JButton trungtam;
    // End of variables declaration//GEN-END:variables
}
