package View;

import Controller.Controller_Reader;
import Model.Model_Reader;
import javax.swing.JOptionPane;

public class View_Reader extends javax.swing.JFrame {

    int Id = 0;
    String title = "READER";
    Controller_Reader controller = new Controller_Reader();

    public View_Reader() {
        initComponents();
        setTitle("ADD");

        setLocationRelativeTo(null);
        lbTitle.setText(title);
    }

    public View_Reader(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("UPDATE (" + Id + ")");

        setLocationRelativeTo(null);
        lbTitle.setText(title);

        txtSave.setText("UPDATE");
        Get();
    }

    public void Get() {
        Model_Reader model = controller.Get(new Model_Reader(Id));
        txtName.setText(model.getName());
        txtSurname.setText(model.getSurname());
        txtGender.setText(model.getGender());
        txtPhone.setText(model.getPhone());
        txtClass.setText(model.get_Class());
        txtSchoolNo.setText(model.getSchool_no());
        txtAddress.setText(model.getAddress());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        txtSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSchoolNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTitle.setText("...");

        txtSave.setText("SAVE");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Surname");

        jLabel2.setText("Gender");

        jLabel3.setText("Phone");

        jLabel4.setText("Class");

        jLabel5.setText("School No");
        jLabel5.setToolTipText("");

        jLabel6.setText("Address");

        jLabel7.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSave, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSchoolNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtClass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSurname)
                            .addComponent(txtAddress)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(txtName)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSchoolNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        if (Id == 0) {
            boolean sonuc = controller.Add(new Model_Reader(
                    txtName.getText(),
                    txtSurname.getText(),
                    txtGender.getText(),
                    txtPhone.getText(),
                    txtClass.getText(),
                    txtSchoolNo.getText(),
                    txtAddress.getText()
            )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration added.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Add record failed.");
            }
        } else {
            boolean sonuc = controller.Update(new Model_Reader(
                    Id,
                    txtName.getText(),
                    txtSurname.getText(),
                    txtGender.getText(),
                    txtPhone.getText(),
                    txtClass.getText(),
                    txtSchoolNo.getText(),
                    txtAddress.getText()
            )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration updated.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Registry update failed.");
            }
        }
    }//GEN-LAST:event_txtSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtSchoolNo;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
