/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author briel
 */
public class TambahPencacah extends javax.swing.JPanel {
    private JScrollPane contentScrollPane;
    /**
     * Creates new form tambahPencacah
     */
    public TambahPencacah(JScrollPane contentScrollPane) {
        initComponents();
        this.contentScrollPane = contentScrollPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKeseluruhan2 = new javax.swing.JPanel();
        LogoBPS2 = new javax.swing.JLabel();
        Garuda2 = new javax.swing.JLabel();
        Indonesia2 = new javax.swing.JLabel();
        PanelRahasia2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UDP = new javax.swing.JLabel();
        PanelTahun = new javax.swing.JPanel();
        Tahun = new javax.swing.JLabel();
        PanelKonstruksi = new javax.swing.JPanel();
        Konstruksi = new javax.swing.JLabel();
        NamaKuesioner = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        jabatanLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        BPS = new javax.swing.JLabel();
        jabatanField = new javax.swing.JTextField();
        TambahPencacah = new javax.swing.JLabel();
        TambahButton = new javax.swing.JButton();

        PanelKeseluruhan2.setBackground(new java.awt.Color(255, 255, 255));

        LogoBPS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/LogoBPS.jpg"))); // NOI18N

        Garuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/Gambar1.jpg"))); // NOI18N

        Indonesia2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Indonesia2.setText("REPUBLIK INDONESIA");

        PanelRahasia2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("RAHASIA");

        javax.swing.GroupLayout PanelRahasia2Layout = new javax.swing.GroupLayout(PanelRahasia2);
        PanelRahasia2.setLayout(PanelRahasia2Layout);
        PanelRahasia2Layout.setHorizontalGroup(
            PanelRahasia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRahasia2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelRahasia2Layout.setVerticalGroup(
            PanelRahasia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRahasia2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UDP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UDP.setText("UDP");

        PanelTahun.setBackground(new java.awt.Color(0, 0, 0));

        Tahun.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Tahun.setForeground(new java.awt.Color(255, 255, 255));
        Tahun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tahun.setText("2014");

        javax.swing.GroupLayout PanelTahunLayout = new javax.swing.GroupLayout(PanelTahun);
        PanelTahun.setLayout(PanelTahunLayout);
        PanelTahunLayout.setHorizontalGroup(
            PanelTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTahunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTahunLayout.setVerticalGroup(
            PanelTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tahun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        PanelKonstruksi.setBackground(new java.awt.Color(0, 0, 0));

        Konstruksi.setBackground(new java.awt.Color(0, 0, 0));
        Konstruksi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Konstruksi.setForeground(new java.awt.Color(255, 255, 255));
        Konstruksi.setText("Konstruksi");

        javax.swing.GroupLayout PanelKonstruksiLayout = new javax.swing.GroupLayout(PanelKonstruksi);
        PanelKonstruksi.setLayout(PanelKonstruksiLayout);
        PanelKonstruksiLayout.setHorizontalGroup(
            PanelKonstruksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKonstruksiLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(Konstruksi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelKonstruksiLayout.setVerticalGroup(
            PanelKonstruksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Konstruksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        NamaKuesioner.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NamaKuesioner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaKuesioner.setText("UPDATING DIREKTORI PERUSAHAAN/USAHA KONSTRUKSI");
        NamaKuesioner.setToolTipText("");
        NamaKuesioner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        namaLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        namaLabel.setText("Nama");

        jabatanLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jabatanLabel.setText("Jabatan");

        namaField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        namaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        namaField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        namaField.setSelectionColor(new java.awt.Color(255, 153, 51));
        namaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFieldActionPerformed(evt);
            }
        });

        BPS.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        BPS.setForeground(new java.awt.Color(0, 0, 204));
        BPS.setText("BADAN PUSAT STATISTIK");

        jabatanField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jabatanField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jabatanField.setSelectionColor(new java.awt.Color(255, 153, 51));
        jabatanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanFieldActionPerformed(evt);
            }
        });

        TambahPencacah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TambahPencacah.setText("Tambah Pencacah");

        TambahButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TambahButton.setText("Tambahkan");
        TambahButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        TambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelKeseluruhan2Layout = new javax.swing.GroupLayout(PanelKeseluruhan2);
        PanelKeseluruhan2.setLayout(PanelKeseluruhan2Layout);
        PanelKeseluruhan2Layout.setHorizontalGroup(
            PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(PanelRahasia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(Garuda2)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKeseluruhan2Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(Indonesia2)
                                .addGap(18, 18, 18)))
                        .addComponent(UDP)
                        .addGap(30, 30, 30)
                        .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelKonstruksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(NamaKuesioner))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TambahPencacah))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(namaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jabatanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jabatanField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(LogoBPS2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BPS)))
                .addGap(21, 21, 21))
        );
        PanelKeseluruhan2Layout.setVerticalGroup(
            PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelRahasia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addComponent(Garuda2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Indonesia2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UDP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addComponent(PanelKonstruksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(PanelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(NamaKuesioner)
                .addGap(28, 28, 28)
                .addComponent(TambahPencacah)
                .addGap(8, 8, 8)
                .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaLabel)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jabatanLabel)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jabatanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(PanelKeseluruhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoBPS2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelKeseluruhan2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(BPS))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKeseluruhan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKeseluruhan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void jabatanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatanFieldActionPerformed

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        // TODO add your handling code here:
        Pencacah pencacah = new Pencacah();
        pencacah.setNama(namaField.getText());
        pencacah.setJabatan(jabatanField.getText());
        if(pencacah.validasi.validate()) {
            Database.getInstance().insertPerson(pencacah.getNama(), pencacah.getJabatan(), "Pencacah");
            JOptionPane.showMessageDialog(this, "Insert Pencacah berhasil");
            contentScrollPane.setViewportView(new HomePanel(contentScrollPane));
        } else {
            String errorMessages = "";
            for(String error : pencacah.error) {
                errorMessages = errorMessages + error + "\n";
            }
            JOptionPane.showMessageDialog(this, errorMessages);
        }
    }//GEN-LAST:event_TambahButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPS;
    private javax.swing.JLabel Garuda2;
    private javax.swing.JLabel Indonesia2;
    private javax.swing.JLabel Konstruksi;
    private javax.swing.JLabel LogoBPS2;
    private javax.swing.JLabel NamaKuesioner;
    private javax.swing.JPanel PanelKeseluruhan2;
    private javax.swing.JPanel PanelKonstruksi;
    private javax.swing.JPanel PanelRahasia2;
    private javax.swing.JPanel PanelTahun;
    private javax.swing.JLabel Tahun;
    private javax.swing.JButton TambahButton;
    private javax.swing.JLabel TambahPencacah;
    private javax.swing.JLabel UDP;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jabatanField;
    private javax.swing.JLabel jabatanLabel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    // End of variables declaration//GEN-END:variables
}
