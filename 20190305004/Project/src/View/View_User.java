package View;

import Controller.Controller_User;
import Model.Model_User;
import javax.swing.JOptionPane;

public final class View_User extends javax.swing.JFrame {

    int Id = 0;
    String title = "USER";
    Controller_User controller = new Controller_User();

    public View_User() {
        initComponents();
        setTitle("ADD");

        setLocationRelativeTo(null);
        lbTitle.setText(title);
    }

    public View_User(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("UPDATE (" + Id + ")");

        setLocationRelativeTo(null);
        lbTitle.setText(title);

        btnSave.setText("UPDATE");
        Get();
    }

    public void Get() {
        Model_User model = controller.Get(new Model_User(Id));
        System.out.println(model);
        txtUsername.setText(model.getUsername());
        txtPassword.setText(model.getPassword());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(lbTitle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addComponent(txtUsername))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the required fields !!");
            return;
        }
        if (Id == 0 && controller.Control(txtUsername.getText())) {
            JOptionPane.showMessageDialog(null, "There are records with the same value !");
            return;
        }
        if (Id == 0) {

            boolean sonuc = controller.Add(new Model_User(
                            txtUsername.getText(),
                            txtPassword.getText()
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration added.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Add record failed.");
            }
        } else {
            boolean sonuc = controller.Update(new Model_User(
                            Id,
                            txtUsername.getText(),
                            txtPassword.getText()
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
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
