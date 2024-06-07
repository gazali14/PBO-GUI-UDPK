/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_kuisioner_udpk.frame_sebelumnya;


/**
 *
 * @author Dewi Nurihandayani
 */
public class aboutFramePanel extends javax.swing.JFrame {

    /**
     * Creates new form aboutAplikasi
     */
    public aboutFramePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("\n     Sejak tahun 2009, Badan Pusat Statistik (BPS) melakukan kegiatan Updating Direktori Perusahaan/Usaha Konstruksi \nsecara rutin yang dilaksanakan secara sampel di seluruh Indonesia.\n     Secara garis besar, tujuan dari pengutipan Direktori Perusahaan Konstruksi 2014 adalah membentuk Kerangka Sampel\nPerusahaan/Usaha Konstruksi yang up-to-date, yang digunakan untuk pengambilan sampel Survei Perusahaan Konstruksi \nTahunan (SKTH), Survei Perusahaan Konstruksi Triwulanan (SKTR), dan Survei Usaha Konstruksi Perorangan (SKP).\n\nPENULIS SOURCE CODE\nKelompok 8 (2KS2)\n1. Briel Sevtriobragi Sihaloho   (222212539)\n2. Dewi Nurihandayani               (222212564)\n3. Fickry Atmayoga Wienaldi    (222212610)\n4. La Ode Muhammad Gazali     (222212696)\n\n\nDESKRIPSI SINGKAT\nAplikasi ini digunakan untuk mengumpulkan data perusahaan/usaha konstruksi guna melakukan pembaharuan data direktori\nusaha konstruksi. Dalam kuisioner ini terdapat jenis pertanyaan terbuka dan tertutup sehingga perlu adanya validasi terhadap\ninputan yang dimasukkan user ke dalam form, apakah sudah sesuai dengan ketentuan yang ada atau belum. Dalam kuisioner\ntersebut terdapat 8 rincian pertanyaan dan 2 rincian yang diisi oleh pewawancara/BPS dengan total 27 kolom isian. Berikut \ntampilan formulir dari Updating Direktori Perusahaan/Usaha Konstruksi 2014.\n\n\nSTRUKTUR KUESIONER\n1. Nama Perusahaan\n    - Nama Pengusaha\n    - Alamat Perusahaan\n    - Kode Pos\n    - Nomor Telepon\n    - Nomor Fax\n    - Nama Provinsi\n    - Nama Kabupaten/Kota\n    - Kode Kabupaten/Kota\n    - Nama Kecamatan\n    - Kode Kecamatan\n    - Nama Desa/Kelurahan\n    - Kode Desa/Kelurahan\n    - Email\n\n2. Rincian Status Perusahaan/Usaha Saat Dikunjungi\n    - Status Usaha\n\n3. Kualifikasi Perusahaan/usaha\n    - Kualifikasi Perusahaan\n\n4. Rincian Badan Hukum/Badan Usaha\n    - Badan Usaha\n\n5. Rincian Pekerjaan Utama\n    - Pekerjaan Utama\n\n6. Rincian Bidang Pekerjaan Utama\n    - Bidang Pekerjaan Utama\n\n7. Rincian Tempat Usaha\n    - Tempat Usaha\n\n8. Rincian Banyaknya Pekerja Tetap\n    - Banyak Pekerja Tetap\n\n9. Rincian Contact Person, Pencacah, Pengawas/Pemeriksa\n    - Nama\n    - Jabatan\n    - Tanggal\n\n10. Rincian Kode KIP\n     - Kode Identifikasi Perusahaan (KIP)\n\n");
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI UPDATING DIREKTORI PERUSAHAAN KONSTRUKSI");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/garuda.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/Logo BPS -.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        home.setText("<-- Home");
        home.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(home);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aboutFramePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aboutFramePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aboutFramePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aboutFramePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutFramePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}