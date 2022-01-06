package View;

import Controller.Controller_Book;
import Controller.Controller_Deposit;
import Controller.Controller_User;
import Controller.Controller_Reader;
import Controller.Controller_Database;
import javax.swing.JOptionPane;

public class View_Managment extends javax.swing.JFrame {

    public View_Managment() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnKitap = new javax.swing.JButton();
        btnKullanici = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnOkuyucu = new javax.swing.JButton();
        btnVerilenKitap = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("MANAGMENT");

        btnKitap.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnKitap.setText("BOOK");
        btnKitap.setToolTipText("");
        btnKitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitapActionPerformed(evt);
            }
        });

        btnKullanici.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnKullanici.setText("USER");
        btnKullanici.setToolTipText("");
        btnKullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn8.setText("EXIT");
        btn8.setToolTipText("");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnOkuyucu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOkuyucu.setText("READER");
        btnOkuyucu.setToolTipText("");
        btnOkuyucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkuyucuActionPerformed(evt);
            }
        });

        btnVerilenKitap.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVerilenKitap.setText("DEPOSIT BOOK");
        btnVerilenKitap.setToolTipText("");
        btnVerilenKitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerilenKitapActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Exit");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Database");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Reset");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVerilenKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOkuyucu, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkuyucu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerilenKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        if (new Controller_Database().Reset()) {
            JOptionPane.showMessageDialog(null, "Database reset !");
            return;
        }
        JOptionPane.showMessageDialog(null, "Operation failed");
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void btnKitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitapActionPerformed
         new View_List(new Controller_Book()).setVisible(true);
    }//GEN-LAST:event_btnKitapActionPerformed

    private void btnKullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciActionPerformed
        new View_List(new Controller_User()).setVisible(true);
    }//GEN-LAST:event_btnKullaniciActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnOkuyucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkuyucuActionPerformed
        new View_List(new Controller_Reader()).setVisible(true);
    }//GEN-LAST:event_btnOkuyucuActionPerformed

    private void btnVerilenKitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerilenKitapActionPerformed
        new View_List(new Controller_Deposit()).setVisible(true);
    }//GEN-LAST:event_btnVerilenKitapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnKitap;
    private javax.swing.JButton btnKullanici;
    private javax.swing.JButton btnOkuyucu;
    private javax.swing.JButton btnVerilenKitap;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
