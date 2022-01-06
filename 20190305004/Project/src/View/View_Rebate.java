package View;

import Controller.Controller_Book;
import Controller.Controller_Deposit;
import Controller.Controller_Reader;
import Model.Model_Book;
import Model.Model_Deposit;
import Model.Model_Reader;
import javax.swing.JOptionPane;

public final class View_Rebate extends javax.swing.JFrame {

    int Id = 0;
    String title = "BOOK REBATE";
    Model_Deposit deposit;
    Controller_Deposit controller = new Controller_Deposit();
    Controller_Book controller_Book = new Controller_Book();
    Controller_Reader controller_Reader = new Controller_Reader();

    public View_Rebate() {
        initComponents();
        setTitle("ADD");

        setLocationRelativeTo(null);
        lbTitle.setText(title);
    }

    public View_Rebate(int _Id) {
        initComponents();
        this.Id = _Id;
        deposit = controller.Get(new Model_Deposit(Id));

        setTitle("REBATE (" + Id + ")");

        setLocationRelativeTo(null);
        lbTitle.setText(title);

        btnSave.setText("REBATE");
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtDay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTitle.setText("...");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Day");

        jLabel3.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDay, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtDay.getText().equals("") || txtDate.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the required fields !!");
            return;
        }
        int gun = Integer.valueOf(txtDay.getText());

        deposit.setDay(gun);
        deposit.setRebate_date(txtDate.getText());
        
        boolean sonuc = controller.Update(deposit);
        if (sonuc) {
            JOptionPane.showMessageDialog(null, "Returned.");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Add record failed.");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDay;
    // End of variables declaration//GEN-END:variables
}
