/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import javax.swing.JOptionPane;

/**
 *
 * @author Nhuan's computer
 */
public class TrangChuUser extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuUser
     */
    public TrangChuUser() {
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

        ttnguoidung = new javax.swing.JButton();
        goiybaitap = new javax.swing.JButton();
        trungtamgan = new javax.swing.JButton();
        nhaptt = new javax.swing.JButton();
        trangchu = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        lichsu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủi người dùng");

        ttnguoidung.setBackground(new java.awt.Color(255, 102, 0));
        ttnguoidung.setForeground(new java.awt.Color(255, 255, 255));
        ttnguoidung.setText("Thông tin người dùng");
        ttnguoidung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttnguoidungActionPerformed(evt);
            }
        });

        goiybaitap.setBackground(new java.awt.Color(255, 102, 0));
        goiybaitap.setForeground(new java.awt.Color(255, 255, 255));
        goiybaitap.setText("Gợi ý bài tập và dinh dưỡng");
        goiybaitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goiybaitapActionPerformed(evt);
            }
        });

        trungtamgan.setBackground(new java.awt.Color(255, 102, 0));
        trungtamgan.setForeground(new java.awt.Color(255, 255, 255));
        trungtamgan.setText("Trung tâm gần bạn");

        nhaptt.setBackground(new java.awt.Color(255, 102, 0));
        nhaptt.setForeground(new java.awt.Color(255, 255, 255));
        nhaptt.setText("Nhập thông tin hàng ngày");
        nhaptt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapttActionPerformed(evt);
            }
        });

        trangchu.setBackground(new java.awt.Color(255, 102, 0));
        trangchu.setForeground(new java.awt.Color(255, 255, 255));
        trangchu.setText("Trang chủ");
        trangchu.setToolTipText("");

        thoat.setBackground(new java.awt.Color(255, 102, 0));
        thoat.setForeground(new java.awt.Color(255, 255, 255));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        lichsu.setBackground(new java.awt.Color(255, 102, 0));
        lichsu.setForeground(new java.awt.Color(255, 255, 255));
        lichsu.setText("Lịch sử nhập thông tin");
        lichsu.setActionCommand("Lịch sử");
        lichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lichsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lichsu, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(trungtamgan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nhaptt, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
                            .addComponent(goiybaitap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttnguoidung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ttnguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(goiybaitap, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trungtamgan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(nhaptt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lichsu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //ấn welcome để trở về welcome
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        int dk=JOptionPane.showConfirmDialog(this,"Ban co muon thoat", "Thanh Cong", JOptionPane.YES_NO_OPTION);
        if(dk!=JOptionPane.YES_OPTION)
            return;
        Welcome wel=new Welcome();
        wel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void ttnguoidungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttnguoidungActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ttnguoidungActionPerformed

    private void goiybaitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goiybaitapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goiybaitapActionPerformed

    private void lichsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lichsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lichsuActionPerformed

    private void nhapttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapttActionPerformed
        // TODO add your handling code here:
        Nhap_Thong_Tin_Hang_Ngay thongtin=new Nhap_Thong_Tin_Hang_Ngay();
            thongtin.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_nhapttActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goiybaitap;
    private javax.swing.JButton lichsu;
    private javax.swing.JButton nhaptt;
    private javax.swing.JButton thoat;
    private javax.swing.JButton trangchu;
    private javax.swing.JButton trungtamgan;
    private javax.swing.JButton ttnguoidung;
    // End of variables declaration//GEN-END:variables
}
