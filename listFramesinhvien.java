/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btcoban2trongnghia;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import btcoban2trongnghia.DSsinhvienservice;
/**
 *
 * @author Dell
 */
public class listFramesinhvien extends javax.swing.JFrame {
     DSsinhvienservice dssinhvienservice;
     DefaultTableModel defaultTableModel;
     DSsinhvienDao dao = new DSsinhvienDao();
    /**
     * Creates new form listFramesinhvien
     */
    public listFramesinhvien() throws SQLException{
        initComponents();
        dssinhvienservice = new DSsinhvienservice();
        defaultTableModel = new DefaultTableModel();
        sinhvienTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("IDtailieu");
        defaultTableModel.addColumn("Tennxs");
        defaultTableModel.addColumn("Tentacgia");
        
        List<dssinhVien> users = dssinhvienservice.getALLsinhvien();
        for(dssinhVien user : users ){
        defaultTableModel.addRow(new Object[]{user.getMasv(),user.getTensv(),user.getLop()});   
        
        }
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
        sinhvienTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        thembtn = new javax.swing.JButton();
        xoabtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jupdatebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sinhvienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(sinhvienTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DANH SACH SINH VIEN");

        thembtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thembtn.setText("th??m");
        thembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thembtnActionPerformed(evt);
            }
        });

        xoabtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xoabtn.setText("x??a");
        xoabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoabtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbtn.setText("back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jupdatebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jupdatebtn.setText("update");
        jupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thembtn)
                                .addGap(65, 65, 65)
                                .addComponent(xoabtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backbtn)
                                .addGap(63, 63, 63)
                                .addComponent(jupdatebtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thembtn)
                    .addComponent(xoabtn)
                    .addComponent(backbtn)
                    .addComponent(jupdatebtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thembtnActionPerformed
        // TODO add your handling code here:
        new addSinhVienFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thembtnActionPerformed

    private void xoabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoabtnActionPerformed
        // TODO add your handling code here:
        int row = sinhvienTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(listFramesinhvien.this, "vui long chon du lieu truoc","Loi",JOptionPane.ERROR_MESSAGE);
        }else{
        int confirm = JOptionPane.showConfirmDialog(listFramesinhvien.this, "ban chac chan muon xoa khong?");
        if(confirm==JOptionPane.YES_OPTION){
            int id = Integer.valueOf(String.valueOf(sinhvienTable.getValueAt(row, 0)));
            
            try {
                dssinhvienservice.xoadulieu(id);
            } catch (SQLException ex) {
                Logger.getLogger(listFramesinhvien.class.getName()).log(Level.SEVERE, null, ex);
            }
        defaultTableModel.setRowCount(0);
         List<dssinhVien> users = null;
        try {
            users = dssinhvienservice.getALLsinhvien();
        } catch (SQLException ex) {
            Logger.getLogger(listFramesinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(dssinhVien user : users ){
        defaultTableModel.addRow(new Object[]{user.getMasv(),user.getTensv(),user.getLop()});
        }             
        }
        }
    }//GEN-LAST:event_xoabtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        new menuFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void jupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdatebtnActionPerformed
         int row = sinhvienTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(listFramesinhvien.this, "vui long chon sach muon sua", "loi", JOptionPane.ERROR_MESSAGE);
        }else{
            int confirm =JOptionPane.showConfirmDialog(listFramesinhvien.this,"B???n ch???c ch???n mu???n s???a ?");
            if(confirm==JOptionPane.YES_OPTION){
                int mssv=Integer.valueOf(String.valueOf(sinhvienTable.getValueAt(row,0)));
            
             try {
                 new updateFrame(mssv).setVisible(true);
             } catch (SQLException ex) {
                 Logger.getLogger(listFramesinhvien.class.getName()).log(Level.SEVERE, null, ex);
             }
           
            this.dispose();
    }//GEN-LAST:event_jupdatebtnActionPerformed
    }
    }
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
            java.util.logging.Logger.getLogger(listFramesinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listFramesinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listFramesinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listFramesinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new listFramesinhvien().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(listFramesinhvien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jupdatebtn;
    private javax.swing.JTable sinhvienTable;
    private javax.swing.JButton thembtn;
    private javax.swing.JButton xoabtn;
    // End of variables declaration//GEN-END:variables
}
