/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author LENOVO
 */
public class KuesionerPanel extends javax.swing.JPanel {
    
    private JScrollPane contentScrollPane;
    private Perusahaan perusahaan;
    /**
     * Creates new form kuesionerPanel
     */
    public KuesionerPanel(JScrollPane contentScrollPane, Perusahaan perusahaan, QuestionaireData qd) {
        initComponents();
        this.contentScrollPane = contentScrollPane;
        this.perusahaan = perusahaan;
        if(qd.getStatusUsaha() != null) {
            statusPerusahaanComboBox.setSelectedItem(qd.getStatusUsaha());
            kualifikasiPerusahaanComboBox.setSelectedItem(qd.getGred());
            badanHukumComboBox.setSelectedItem(qd.getBadanUsaha());
            jenisBoronganField.setText(qd.getPekerjaanUtama());
            bidangPekerjaanComboBox.setSelectedItem(qd.getBidangPekerjaanUtama());
            tempatUsahaComboBox.setSelectedItem(qd.getTempatUsaha());
            jmlPekerjaLakiSpinner.setValue(qd.getBanyakPekerjaLaki());
            jmlPekerjaPerempuanSpinner.setValue(qd.getBanyakPekerjaPerempuan());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulKuesionerPanel = new javax.swing.JLabel();
        statusPerusahaanLabel = new javax.swing.JLabel();
        kualifikasiPerusahaanLabel = new javax.swing.JLabel();
        badanHukumLabel = new javax.swing.JLabel();
        jenisBoronganLabel = new javax.swing.JLabel();
        statusPerusahaanComboBox = new javax.swing.JComboBox<>();
        kualifikasiPerusahaanComboBox = new javax.swing.JComboBox<>();
        badanHukumComboBox = new javax.swing.JComboBox<>();
        jenisBoronganField = new javax.swing.JTextField();
        bidangPekerjaanUtamaLabel = new javax.swing.JLabel();
        bidangPekerjaanComboBox = new javax.swing.JComboBox<>();
        tempatUsahaLabel = new javax.swing.JLabel();
        tempatUsahaComboBox = new javax.swing.JComboBox<>();
        tempatUsahaLainnya = new javax.swing.JTextField();
        banyakPekerjaLabel = new javax.swing.JLabel();
        jmlPekerjaLakiLabel = new javax.swing.JLabel();
        jmlPekerjaPerempuanLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jmlPekerjaLakiSpinner = new javax.swing.JSpinner();
        jmlPekerjaPerempuanSpinner = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));

        judulKuesionerPanel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulKuesionerPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulKuesionerPanel.setText("Pengisian Kuesioner UDPK");

        statusPerusahaanLabel.setText("Status Perusahaan/Usaha Saat Dikunjungi       :");

        kualifikasiPerusahaanLabel.setText("Kualifikasi Perusahaan/Usaha (Gred)                 :");

        badanHukumLabel.setText("Badan Hukum/Badan Usaha                             :");

        jenisBoronganLabel.setText("Isikan Jenis borongan Pekerjaan Utama Yang Biasa Dikerjakan:");

        statusPerusahaanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None Selected>", "Aktif Lama", "Aktif Baru", "Tutup", "Tidak Ditemukan", "Bukan Konstruksi" }));
        statusPerusahaanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusPerusahaanComboBoxActionPerformed(evt);
            }
        });

        kualifikasiPerusahaanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None Selected>", "Gred 1", "Gred 2", "Gred 3", "Gred 4", "Gred 5", "Gred 6", "Gred 7", "Non Gred" }));
        kualifikasiPerusahaanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kualifikasiPerusahaanComboBoxActionPerformed(evt);
            }
        });

        badanHukumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None Selected>", "PT. Persero", "PT.", "CV", "Firma", "Koperasi", "Perorangan", "Lainnya" }));

        bidangPekerjaanUtamaLabel.setText("Bidang Pekerjaan Utama                                   :");

        bidangPekerjaanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None Selected>", "Konstruksi Gedung", "Konstruksi Sipil", "Konstruksi Khusus" }));

        tempatUsahaLabel.setText("Tempat Usaha                                                   :");

        tempatUsahaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<None Selected>", "Kantor", "Rumah Tinggal", "Rukan", "Lainnya" }));
        tempatUsahaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatUsahaComboBoxActionPerformed(evt);
            }
        });

        tempatUsahaLainnya.setEnabled(false);

        banyakPekerjaLabel.setText("Banyak Pekerja Tetap                      :");

        jmlPekerjaLakiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmlPekerjaLakiLabel.setText("Laki-laki");

        jmlPekerjaPerempuanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmlPekerjaPerempuanLabel.setText("Perempuan");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("(jumlah pekerja tetap pada saat pencacahan)");

        nextButton.setBackground(new java.awt.Color(102, 255, 102));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(banyakPekerjaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jmlPekerjaLakiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jmlPekerjaLakiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jmlPekerjaPerempuanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jmlPekerjaPerempuanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(back)
                                        .addGap(18, 18, 18)
                                        .addComponent(nextButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(kualifikasiPerusahaanLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(kualifikasiPerusahaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(statusPerusahaanLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(statusPerusahaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(badanHukumLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(badanHukumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jenisBoronganLabel)
                                        .addComponent(jenisBoronganField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bidangPekerjaanUtamaLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(bidangPekerjaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tempatUsahaLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(tempatUsahaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tempatUsahaLainnya))))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(judulKuesionerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(judulKuesionerPanel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusPerusahaanLabel)
                    .addComponent(statusPerusahaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kualifikasiPerusahaanLabel)
                    .addComponent(kualifikasiPerusahaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badanHukumLabel)
                    .addComponent(badanHukumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jenisBoronganLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisBoronganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bidangPekerjaanUtamaLabel)
                    .addComponent(bidangPekerjaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempatUsahaLabel)
                    .addComponent(tempatUsahaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempatUsahaLainnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banyakPekerjaLabel)
                    .addComponent(jmlPekerjaLakiLabel)
                    .addComponent(jmlPekerjaPerempuanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jmlPekerjaLakiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jmlPekerjaPerempuanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        QuestionaireData qd = new QuestionaireData();
        qd.setPerusahaan(perusahaan);
        qd.setGred(kualifikasiPerusahaanComboBox.getSelectedItem().toString());
        qd.setStatusUsaha(statusPerusahaanComboBox.getSelectedItem().toString());
        qd.setBadanUsaha(badanHukumComboBox.getSelectedItem().toString());
        qd.setPekerjaanUtama(jenisBoronganField.getText());
        qd.setBidangPekerjaanUtama(bidangPekerjaanComboBox.getSelectedItem().toString());
        qd.setTempatUsaha(tempatUsahaComboBox.getSelectedItem().toString());
        qd.setBanyakPekerjaLaki((int) jmlPekerjaLakiSpinner.getValue());
        qd.setBanyakPekerjaPerempuan((int) jmlPekerjaPerempuanSpinner.getValue());
        
        if(qd.validasi.validate()) {
            contentScrollPane.setViewportView(new PersonKuesionerPanel(contentScrollPane, perusahaan, qd));
        } else {
            String errorMessages = "";
            for(String error : qd.error) {
                errorMessages = errorMessages + error + "\n";
            }
            JOptionPane.showMessageDialog(this, errorMessages);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        contentScrollPane.setViewportView(new PerusahaanPanel(contentScrollPane, perusahaan));
    }//GEN-LAST:event_backActionPerformed

    private void statusPerusahaanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusPerusahaanComboBoxActionPerformed
        // TODO add your handling code here:
        if(statusPerusahaanComboBox.getSelectedIndex() >= 3 ) {
            kualifikasiPerusahaanComboBox.setEnabled(false);
            kualifikasiPerusahaanComboBox.setSelectedItem(0);
            badanHukumComboBox.setSelectedIndex(0);
            badanHukumComboBox.setEnabled(false);
            jenisBoronganField.setText("none");
            jenisBoronganField.setEnabled(false);
            bidangPekerjaanComboBox.setSelectedIndex(0);
            bidangPekerjaanComboBox.setEnabled(false);
            tempatUsahaComboBox.setSelectedIndex(0);
            tempatUsahaComboBox.setEnabled(false);
            jmlPekerjaLakiSpinner.setValue(0);
            jmlPekerjaLakiSpinner.setEnabled(false);
            jmlPekerjaPerempuanSpinner.setValue(0);
            jmlPekerjaPerempuanSpinner.setEnabled(false);
        } else {
            kualifikasiPerusahaanComboBox.setEnabled(true);
            badanHukumComboBox.setEnabled(true);
            jenisBoronganField.setEnabled(true);
            bidangPekerjaanComboBox.setEnabled(true);
            tempatUsahaComboBox.setEnabled(true);
            jmlPekerjaLakiSpinner.setEnabled(true);
            jmlPekerjaPerempuanSpinner.setEnabled(true);
        }
    }//GEN-LAST:event_statusPerusahaanComboBoxActionPerformed

    private void kualifikasiPerusahaanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kualifikasiPerusahaanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kualifikasiPerusahaanComboBoxActionPerformed

    private void tempatUsahaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatUsahaComboBoxActionPerformed
        // TODO add your handling code here:
        if(tempatUsahaComboBox.getSelectedIndex() == 4) {
            tempatUsahaLainnya.setEnabled(true);
        } else {
            tempatUsahaLainnya.setEnabled(false);
        }
    }//GEN-LAST:event_tempatUsahaComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> badanHukumComboBox;
    private javax.swing.JLabel badanHukumLabel;
    private javax.swing.JLabel banyakPekerjaLabel;
    private javax.swing.JComboBox<String> bidangPekerjaanComboBox;
    private javax.swing.JLabel bidangPekerjaanUtamaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jenisBoronganField;
    private javax.swing.JLabel jenisBoronganLabel;
    private javax.swing.JLabel jmlPekerjaLakiLabel;
    private javax.swing.JSpinner jmlPekerjaLakiSpinner;
    private javax.swing.JLabel jmlPekerjaPerempuanLabel;
    private javax.swing.JSpinner jmlPekerjaPerempuanSpinner;
    private javax.swing.JLabel judulKuesionerPanel;
    private javax.swing.JComboBox<String> kualifikasiPerusahaanComboBox;
    private javax.swing.JLabel kualifikasiPerusahaanLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> statusPerusahaanComboBox;
    private javax.swing.JLabel statusPerusahaanLabel;
    private javax.swing.JComboBox<String> tempatUsahaComboBox;
    private javax.swing.JLabel tempatUsahaLabel;
    private javax.swing.JTextField tempatUsahaLainnya;
    // End of variables declaration//GEN-END:variables
}
