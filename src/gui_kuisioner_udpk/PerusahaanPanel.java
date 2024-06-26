/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class PerusahaanPanel extends javax.swing.JPanel {
    
    private JScrollPane contentScrollPane;
    
    /**
     * Creates new form perusahaanPanel
     */
    public PerusahaanPanel(JScrollPane contentScrollPane, Perusahaan perusahaan) {
        initComponents();
        this.contentScrollPane = contentScrollPane;
        if (perusahaan.getKIP() != null) {
            kipField.setText(perusahaan.getKIP());
            namaPerusahaanField.setText(perusahaan.getNamaPerusahaan());
            namaPengusahaField.setText(perusahaan.getNamaPengusaha());
            alamatField.setText(perusahaan.getAlamat());
            kodePosField.setText(perusahaan.getKodePos());
            teleponField.setText(perusahaan.getTelepon());
            faxField.setText(perusahaan.getFax());
            hpField.setText(perusahaan.getNoHP());
            provinsiComboBox.setSelectedItem(perusahaan.getProvinsi());
            kodeProvinsiField.setText(perusahaan.getKodeProv());
            kabupatenField.setText(perusahaan.getKabupaten());
            kodeKabupatenField.setText(perusahaan.getKodeKab());
            kecamatanField.setText(perusahaan.getKecamatan());
            kodeKecamatanField.setText(perusahaan.getKodeKec());
            desaField.setText(perusahaan.getDesa());
            kodeDesaField.setText(perusahaan.getKodeDes());
            emailField.setText(perusahaan.getEmail());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaPerusahaanField = new javax.swing.JTextField();
        alamatField = new javax.swing.JTextField();
        namaPengusahaField = new javax.swing.JTextField();
        kodePosField = new javax.swing.JTextField();
        teleponField = new javax.swing.JTextField();
        hpField = new javax.swing.JTextField();
        kabupatenField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        faxField = new javax.swing.JTextField();
        kecamatanField = new javax.swing.JTextField();
        desaField = new javax.swing.JTextField();
        provinsiComboBox = new javax.swing.JComboBox<>();
        keteranganUmumLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kipLabel = new javax.swing.JLabel();
        kipField = new javax.swing.JTextField();
        kodeKabupatenField = new javax.swing.JTextField();
        kodeKecamatanField = new javax.swing.JTextField();
        kodeDesaField = new javax.swing.JTextField();
        kodeProvinsiField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        UDP = new javax.swing.JLabel();
        PanelKonstruksi = new javax.swing.JPanel();
        Konstruksi = new javax.swing.JLabel();
        PanelTahun = new javax.swing.JPanel();
        Tahun = new javax.swing.JLabel();
        PanelRahasia = new javax.swing.JPanel();
        Rahasia = new javax.swing.JLabel();
        Garuda = new javax.swing.JLabel();
        Indonesia = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        namaPerusahaanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPerusahaanFieldActionPerformed(evt);
            }
        });

        alamatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatFieldActionPerformed(evt);
            }
        });

        namaPengusahaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPengusahaFieldActionPerformed(evt);
            }
        });

        kodePosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePosFieldActionPerformed(evt);
            }
        });

        teleponField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponFieldActionPerformed(evt);
            }
        });

        hpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpFieldActionPerformed(evt);
            }
        });

        kabupatenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabupatenFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(0, 255, 51));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        faxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxFieldActionPerformed(evt);
            }
        });

        kecamatanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kecamatanFieldActionPerformed(evt);
            }
        });

        desaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desaFieldActionPerformed(evt);
            }
        });

        provinsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<No Province Selected>", "Nanggroe Aceh Darussalam", "Sumatera Utara", "Sumatera Selatan", "Sumatera Barat", "Bengkulu", "Riau", "Kepulauan Riau ", "Jambi", "Lampung", "Bangka Belitung", "Kalimantan Barat", "Kalimantan Timur", "Kalimantan Selatan", "Kalimantan Tengah", "Kalimantan Utara", "Banten", "DKI Jakarta", "Jawa Barat", "Jawa Tengah", "Daerah Istimewa Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara Timur", "Nusa Tenggara Barat", "Gorontalo", "Sulawesi Barat", "Sulawesi Tengah", "Sulawesi Utara", "Sulawesi Tenggara", "Sulawesi Selatan", "Maluku Utara", "Maluku", "Papua Barat", "Papua", "Papua Tengah", "Papua Pegunungan", "Papua Selatan", "Papua Barat Daya" }));
        provinsiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsiComboBoxActionPerformed(evt);
            }
        });

        keteranganUmumLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keteranganUmumLabel.setText("Isikan Keterangan Umum Perusahaan/Usaha");

        jLabel3.setText("Nama Perusahaan/Usaha");

        jLabel4.setText("Nama Pengusaha");

        jLabel5.setText("Kode Pos");

        jLabel6.setText("Telepon");

        jLabel7.setText("Kabupaten/Kota");

        jLabel8.setText("Alamat");

        jLabel9.setText("HP");

        jLabel10.setText("Provinsi");

        jLabel11.setText("Kecamatan");

        jLabel12.setText("Fax.");

        jLabel14.setText("Desa/Kelurahan");

        jLabel13.setText("E-mail");

        jLabel15.setText("Kode");

        jLabel16.setText("Kode");

        jLabel17.setText("Kode");

        jLabel18.setText("Kode");

        kipLabel.setText("KIP");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("UPDATING DIREKTORI PERUSAHAAN KONSTRUKSI");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/Logo BPS -.png"))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        UDP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UDP.setText("UDP");

        PanelKonstruksi.setBackground(new java.awt.Color(0, 0, 0));

        Konstruksi.setBackground(new java.awt.Color(0, 0, 0));
        Konstruksi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Konstruksi.setForeground(new java.awt.Color(255, 255, 255));
        Konstruksi.setText("Konstruksi");

        javax.swing.GroupLayout PanelKonstruksiLayout = new javax.swing.GroupLayout(PanelKonstruksi);
        PanelKonstruksi.setLayout(PanelKonstruksiLayout);
        PanelKonstruksiLayout.setHorizontalGroup(
            PanelKonstruksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKonstruksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Konstruksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKonstruksiLayout.setVerticalGroup(
            PanelKonstruksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Konstruksi, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

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
            .addComponent(Tahun, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        PanelRahasia.setBackground(new java.awt.Color(255, 204, 153));

        Rahasia.setBackground(new java.awt.Color(255, 204, 153));
        Rahasia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Rahasia.setText("RAHASIA");

        javax.swing.GroupLayout PanelRahasiaLayout = new javax.swing.GroupLayout(PanelRahasia);
        PanelRahasia.setLayout(PanelRahasiaLayout);
        PanelRahasiaLayout.setHorizontalGroup(
            PanelRahasiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRahasiaLayout.createSequentialGroup()
                .addComponent(Rahasia)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelRahasiaLayout.setVerticalGroup(
            PanelRahasiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRahasiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rahasia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Garuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/Gambar1.jpg"))); // NOI18N

        Indonesia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Indonesia.setText("REPUBLIK INDONESIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kipLabel)
                            .addComponent(keteranganUmumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(111, 111, 111)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodePosField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(teleponField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(faxField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hpField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nextButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(kabupatenField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel17))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(kecamatanField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(desaField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel16)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kodeKabupatenField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kodeKecamatanField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kodeDesaField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kodeProvinsiField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaPengusahaField, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(namaPerusahaanField)
                                    .addComponent(kipField))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelRahasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(Garuda)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Indonesia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(UDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelKonstruksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelRahasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UDP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(PanelKonstruksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PanelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Garuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Indonesia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(keteranganUmumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kipLabel)
                    .addComponent(kipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaPerusahaanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaPengusahaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(kodePosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleponField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(faxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeProvinsiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kabupatenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeKabupatenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kecamatanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeKecamatanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeDesaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void namaPerusahaanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPerusahaanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPerusahaanFieldActionPerformed

    private void alamatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatFieldActionPerformed

    private void namaPengusahaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPengusahaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPengusahaFieldActionPerformed

    private void kodePosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodePosFieldActionPerformed

    private void teleponFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponFieldActionPerformed

    private void hpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpFieldActionPerformed

    private void kabupatenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabupatenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kabupatenFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void faxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faxFieldActionPerformed

    private void kecamatanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kecamatanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kecamatanFieldActionPerformed

    private void desaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desaFieldActionPerformed

    private void provinsiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiComboBoxActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        Perusahaan perusahaan = new Perusahaan();
        perusahaan.setKIP(kipField.getText());
        perusahaan.setNamaPerusahaan(namaPerusahaanField.getText());
        perusahaan.setNamaPengusaha(namaPengusahaField.getText());
        perusahaan.setAlamat(alamatField.getText());
        perusahaan.setKodePos(kodePosField.getText());
        perusahaan.setTelepon(teleponField.getText());
        perusahaan.setFax(faxField.getText());
        perusahaan.setNoHP(hpField.getText());
        perusahaan.setProvinsi(provinsiComboBox.getSelectedItem().toString());
        perusahaan.setKodeProv(kodeProvinsiField.getText());
        perusahaan.setKabupaten(kabupatenField.getText());
        perusahaan.setKodeKab(kodeKabupatenField.getText());
        perusahaan.setKecamatan(kecamatanField.getText());
        perusahaan.setKodeKec(kodeKecamatanField.getText());
        perusahaan.setDesa(desaField.getText());
        perusahaan.setKodeDes(kodeDesaField.getText());
        perusahaan.setEmail(emailField.getText());
        
        if(perusahaan.getValidasi()) {
            contentScrollPane.setViewportView(new KuesionerPanel(contentScrollPane, perusahaan, new QuestionaireData()));
        } else {
            String errorMessages = "";
            for(String error : perusahaan.error) {
                errorMessages = errorMessages + error + "\n";
            }
            JOptionPane.showMessageDialog(this, errorMessages);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Garuda;
    private javax.swing.JLabel Indonesia;
    private javax.swing.JLabel Konstruksi;
    private javax.swing.JPanel PanelKonstruksi;
    private javax.swing.JPanel PanelRahasia;
    private javax.swing.JPanel PanelTahun;
    private javax.swing.JLabel Rahasia;
    private javax.swing.JLabel Tahun;
    private javax.swing.JLabel UDP;
    private javax.swing.JTextField alamatField;
    private javax.swing.JTextField desaField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField faxField;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kabupatenField;
    private javax.swing.JTextField kecamatanField;
    private javax.swing.JLabel keteranganUmumLabel;
    private javax.swing.JTextField kipField;
    private javax.swing.JLabel kipLabel;
    private javax.swing.JTextField kodeDesaField;
    private javax.swing.JTextField kodeKabupatenField;
    private javax.swing.JTextField kodeKecamatanField;
    private javax.swing.JTextField kodePosField;
    private javax.swing.JTextField kodeProvinsiField;
    private javax.swing.JTextField namaPengusahaField;
    private javax.swing.JTextField namaPerusahaanField;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> provinsiComboBox;
    private javax.swing.JTextField teleponField;
    // End of variables declaration//GEN-END:variables

}
