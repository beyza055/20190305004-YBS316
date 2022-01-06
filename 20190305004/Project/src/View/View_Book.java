package View;

import Controller.Controller_Book;
import Model.Model_Book;
import javax.swing.JOptionPane;

public final class View_Book extends javax.swing.JFrame {

    int Id = 0;
    String title = "BOOK";

    Controller_Book controller = new Controller_Book();

    public View_Book() {
        initComponents();
        setTitle("ADD");

        setLocationRelativeTo(null);
        lbTitle.setText(title);
    }

    public View_Book(int _Id) {
        initComponents();
        this.Id = _Id;
        setTitle("UPDATE (" + Id + ")");

        setLocationRelativeTo(null);
        lbTitle.setText(title);

        btnSave.setText("UPDATE");
        Get();
    }

    public void Get() {
        Model_Book model = controller.Get(new Model_Book(Id));

        txtName.setText(model.getName());
        txtGenre.setText(model.getGenre());
        txtAuthor.setText(model.getAuthor());
        txtBroadcaster.setText(model.getBroadcaster());
        txtDescription.setText(model.getDescription());
        txtCabinet.setText(model.getCabinet());
        txtShelf.setText(String.valueOf(model.getShelf()));
        txtReleaseYear.setText(String.valueOf(model.getPubyear()));
        txtPageNumber.setText(String.valueOf(model.getPagenumber()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCabinet = new javax.swing.JTextField();
        txtShelf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGenre = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBroadcaster = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtReleaseYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPageNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel1.setText("Cabinet");

        jLabel2.setText("Shelf");

        jLabel7.setText("Name");

        jLabel8.setText("Genre");

        jLabel9.setText("Author");

        jLabel10.setText("Broadcaster");

        jLabel11.setText("Description");

        jLabel3.setText("Release Year");

        jLabel4.setText("Num of Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBroadcaster)
                            .addComponent(txtGenre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbTitle)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescription)
                            .addComponent(txtName)
                            .addComponent(txtShelf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCabinet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtReleaseYear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPageNumber, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                    .addComponent(jLabel8)
                    .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBroadcaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCabinet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtShelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtName.getText().equals("") || txtCabinet.getText().equals("") || txtShelf.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fill in the required fields !!");
            return;
        }
        if (Id == 0 && controller.Control(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "There are records with the same value !");
            return;
        }
        if (Id == 0) {

            boolean sonuc = controller.Add(new Model_Book(
                            txtName.getText(),
                            txtGenre.getText(),
                            txtAuthor.getText(),
                            txtBroadcaster.getText(),
                            txtDescription.getText(),
                            txtCabinet.getText(),
                            Integer.valueOf(txtShelf.getText()),
                            Integer.valueOf(txtReleaseYear.getText()),
                            Integer.valueOf(txtPageNumber.getText())
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "Registration added.");
            } else {
                JOptionPane.showMessageDialog(null, "Add record failed.");
            }
        } else {
            boolean sonuc = controller.Update(new Model_Book(
                            Id,
                            txtName.getText(),
                            txtGenre.getText(),
                            txtAuthor.getText(),
                            txtBroadcaster.getText(),
                            txtDescription.getText(),
                            txtCabinet.getText(),
                            Integer.valueOf(txtShelf.getText()),
                            Integer.valueOf(txtReleaseYear.getText()),
                            Integer.valueOf(txtPageNumber.getText())
                    )
            );
            if (sonuc) {
                JOptionPane.showMessageDialog(null, "The record has been updated.");
            } else {
                JOptionPane.showMessageDialog(null, "Registry update failed.");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBroadcaster;
    private javax.swing.JTextField txtCabinet;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPageNumber;
    private javax.swing.JTextField txtReleaseYear;
    private javax.swing.JTextField txtShelf;
    // End of variables declaration//GEN-END:variables
}
