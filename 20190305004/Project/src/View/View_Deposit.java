package View;

import Controller.Controller_Book;
import Controller.Controller_Deposit;
import Controller.Controller_Reader;
import Model.Model_Book;
import Model.Model_Deposit;
import Model.Model_Reader;
import javax.swing.JOptionPane;

public final class View_Deposit extends javax.swing.JFrame {

    int Id = 0;
    String title = "DEPOSIT";

    Controller_Deposit controller = new Controller_Deposit();
    Controller_Book controller_Book = new Controller_Book();
    Controller_Reader controller_Reader = new Controller_Reader();

    public View_Deposit() {
        initComponents();
        setTitle("ADD");

        setLocationRelativeTo(null);
        lbBaslik.setText(title);
    }

    public View_Deposit(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("UPDATE (" + Id + ")");

        setLocationRelativeTo(null);
        lbBaslik.setText(title);

        btnSave.setText("UPDATE");
        Get();
    }

    public void Get() {
        Model_Deposit model = controller.Get(new Model_Deposit(Id));

        txtBookId.setText(String.valueOf(model.getBook_id()));
        txtReaderId.setText(String.valueOf(model.getReader_id()));
        txtDay.setText(String.valueOf(model.getDay()));
        txtDate.setText(model.getDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBaslik = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtReaderId = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbBaslik.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbBaslik.setText("...");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Reader ID");

        jLabel2.setText("Day");

        jLabel7.setText("Book ID");

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
                            .addComponent(lbBaslik)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDay, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReaderId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBaslik)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReaderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtBookId.getText().equals("") || txtReaderId.getText().equals("") || txtDay.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the required fields !!");
            return;
        }
        int kitap_id = Integer.valueOf(txtBookId.getText());
        int reader_id = Integer.valueOf(txtReaderId.getText());

        if (controller_Book.Get(new Model_Book(kitap_id)) == null) {
            JOptionPane.showMessageDialog(this, "Book not found !!");
            return;
        }
        if (controller_Reader.Get(new Model_Reader(reader_id)) == null) {
            JOptionPane.showMessageDialog(this, "Reader not found !!");
            return;
        }
        if (Id == 0) {

            boolean sonuc = controller.Add(new Model_Deposit(
                            kitap_id,
                            reader_id,
                            Integer.valueOf(txtDay.getText()),
                            txtDate.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration added.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Add record failed.");
            }
        } else {
            boolean sonuc = controller.Update(new Model_Deposit(
                            Id,
                            kitap_id,
                            reader_id,
                            Integer.valueOf(txtDay.getText()),
                            txtDate.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration updated.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Registry update failed.");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbBaslik;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtReaderId;
    // End of variables declaration//GEN-END:variables
}
