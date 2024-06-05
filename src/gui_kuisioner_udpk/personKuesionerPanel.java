/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author LENOVO
 */
public class personKuesionerPanel extends javax.swing.JPanel {
    
    private JScrollPane contentScrollPane;
    private Perusahaan perusahaan;
    private QuestionaireData qd;
    /**
     * Creates new form kuesionerPanel2
     */
    public personKuesionerPanel(JScrollPane contentScrollPane, Perusahaan perusahaan, QuestionaireData qd) {
        initComponents();
        this.contentScrollPane = contentScrollPane;
        this.perusahaan = perusahaan;
        this.qd = qd;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        judulKuesionerPanel = new javax.swing.JLabel();
        contactPersonLabel = new javax.swing.JLabel();
        namaCPLabel = new javax.swing.JLabel();
        namaCPField = new javax.swing.JTextField();
        pencacahLabel = new javax.swing.JLabel();
        namaPencacahLabel = new javax.swing.JLabel();
        namaPencacahField = new javax.swing.JTextField();
        tanggalPencacahLabel = new javax.swing.JLabel();
        pengawasLabel = new javax.swing.JLabel();
        namaPengawasLabel = new javax.swing.JLabel();
        namaPengawasField = new javax.swing.JTextField();
        tanggalPencacahLabel1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        catatanLabel = new javax.swing.JLabel();
        catatanField = new javax.swing.JTextField();
        jabatanCPLabel = new javax.swing.JLabel();
        JabatanCPField = new javax.swing.JTextField();
        tanggalPencacahField = new javax.swing.JTextField();
        tanggalPengawasField = new javax.swing.JTextField();

        dateChooser1.setForeground(new java.awt.Color(153, 204, 255));
        dateChooser1.setTextRefernce(tanggalPencacahField);

        dateChooser2.setForeground(new java.awt.Color(153, 204, 255));
        dateChooser2.setTextRefernce(tanggalPengawasField);

        setBackground(new java.awt.Color(255, 255, 255));

        judulKuesionerPanel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulKuesionerPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulKuesionerPanel.setText("Pengisian Kuesioner UDPK");

        contactPersonLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactPersonLabel.setText("Contact Person");

        namaCPLabel.setText("Nama                   :");

        pencacahLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pencacahLabel.setText("Pencacah");

        namaPencacahLabel.setText("Nama                   :");

        tanggalPencacahLabel.setText("Tanggal                :");

        pengawasLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pengawasLabel.setText("Pengawas");

        namaPengawasLabel.setText("Nama                   :");

        tanggalPencacahLabel1.setText("Tanggal                :");

        nextButton.setBackground(new java.awt.Color(102, 255, 102));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        catatanLabel.setText("Catatan :");

        jabatanCPLabel.setText("Jabatan                :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulKuesionerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(catatanField)
                    .addComponent(catatanLabel)
                    .addComponent(contactPersonLabel)
                    .addComponent(pencacahLabel)
                    .addComponent(pengawasLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tanggalPencacahLabel1)
                                .addGap(211, 211, 211))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(namaPencacahLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(tanggalPencacahLabel)
                                                .addGap(82, 82, 82)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namaPencacahField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(tanggalPencacahField)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(namaPengawasLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tanggalPengawasField)
                                            .addComponent(namaPengawasField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaCPLabel)
                                    .addComponent(jabatanCPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaCPField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(JabatanCPField))))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(judulKuesionerPanel)
                .addGap(27, 27, 27)
                .addComponent(contactPersonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaCPLabel)
                    .addComponent(namaCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatanCPLabel)
                    .addComponent(JabatanCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pencacahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPencacahLabel)
                    .addComponent(namaPencacahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPencacahLabel)
                    .addComponent(tanggalPencacahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(pengawasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPengawasLabel)
                    .addComponent(namaPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPencacahLabel1)
                    .addComponent(tanggalPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catatanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catatanField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        contentScrollPane.setViewportView(new kuesionerPanel(contentScrollPane, perusahaan, qd));
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        ContactPerson cp = new ContactPerson();
        cp.setNama(namaCPField.getText());
        cp.setJabatan(JabatanCPField.getText());

        Pencacah pc = new Pencacah();
        pc.setNama(namaPencacahField.getText());

        String tanggalPencacah = tanggalPencacahField.getText();

        Pengawas pg = new Pengawas();
        pg.setNama(namaPengawasField.getText());

        String tanggalPengawas = tanggalPengawasField.getText();


        String catatan = catatanField.getText();

        if(cp.validasi.validate()) {
            if(pc.validasi.validate()) {
                if(pg.validasi.validate()) {
                    Database.getInstance().insertPerusahaan(perusahaan);
                    Database.getInstance().insertPerson(cp.getNama(), cp.getJabatan(), cp.getKeterangan());
                    Database.getInstance().insertKuisioner(perusahaan.getKIP(), qd, pg.getNama(), pc.getNama(), cp.getNama(), tanggalPencacah, tanggalPengawas, catatan);
                    JOptionPane.showMessageDialog(this, "Insert data kuesioner berhasil!");
                    contentScrollPane.setViewportView(new homePanel(contentScrollPane));
                } else {
                    String errorMessages = "";
                    for(String error : pg.error) {
                        errorMessages = errorMessages + error + "\n";
                    }
                    JOptionPane.showMessageDialog(this, errorMessages);
                }
            } else {
                String errorMessages = "";
                for(String error : pc.error) {
                    errorMessages = errorMessages + error + "\n";
                }
                JOptionPane.showMessageDialog(this, errorMessages);
            }
        } else {
            String errorMessages = "";
            for(String error : cp.error) {
                errorMessages = errorMessages + error + "\n";
            }
            JOptionPane.showMessageDialog(this, errorMessages);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JabatanCPField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField catatanField;
    private javax.swing.JLabel catatanLabel;
    private javax.swing.JLabel contactPersonLabel;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jabatanCPLabel;
    private javax.swing.JLabel judulKuesionerPanel;
    private javax.swing.JTextField namaCPField;
    private javax.swing.JLabel namaCPLabel;
    private javax.swing.JTextField namaPencacahField;
    private javax.swing.JLabel namaPencacahLabel;
    private javax.swing.JTextField namaPengawasField;
    private javax.swing.JLabel namaPengawasLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pencacahLabel;
    private javax.swing.JLabel pengawasLabel;
    private javax.swing.JTextField tanggalPencacahField;
    private javax.swing.JLabel tanggalPencacahLabel;
    private javax.swing.JLabel tanggalPencacahLabel1;
    private javax.swing.JTextField tanggalPengawasField;
    // End of variables declaration//GEN-END:variables
}
