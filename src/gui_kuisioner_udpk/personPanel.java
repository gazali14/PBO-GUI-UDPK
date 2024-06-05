/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

/**
 *
 * @author LENOVO
 */
public class personPanel extends javax.swing.JPanel {

    /**
     * Creates new form kuesionerPanel2
     */
    public personPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulKuesionerPanel = new javax.swing.JLabel();
        tanggalPengawasField = new javax.swing.JFormattedTextField();
        contactPersonLabel = new javax.swing.JLabel();
        namaCPLabel = new javax.swing.JLabel();
        namaCPField = new javax.swing.JTextField();
        jabatanCPLabel = new javax.swing.JLabel();
        jabatanCPField = new javax.swing.JTextField();
        tanggalCPLabel = new javax.swing.JLabel();
        tanggalCPField = new javax.swing.JFormattedTextField();
        pencacahLabel = new javax.swing.JLabel();
        namaPencacahLabel = new javax.swing.JLabel();
        namaPencacahField = new javax.swing.JTextField();
        jabatanPencacahLabel = new javax.swing.JLabel();
        jabatanPencacahField = new javax.swing.JTextField();
        tanggalPencacahLabel = new javax.swing.JLabel();
        tanggalPencacahField = new javax.swing.JFormattedTextField();
        pengawasLabel = new javax.swing.JLabel();
        namaPengawasLabel = new javax.swing.JLabel();
        namaPengawasField = new javax.swing.JTextField();
        jabatanPengawasLabel = new javax.swing.JLabel();
        jabatanPengawasField = new javax.swing.JTextField();
        tanggalPencacahLabel1 = new javax.swing.JLabel();
        lanjutkanButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();

        judulKuesionerPanel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulKuesionerPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulKuesionerPanel.setText("Pengisian Kuesioner UDPK");

        tanggalPengawasField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        contactPersonLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactPersonLabel.setText("Contact Person");

        namaCPLabel.setText("Nama                   :");

        jabatanCPLabel.setText("Jabatan                :");

        tanggalCPLabel.setText("Tanggal                :");

        tanggalCPField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        pencacahLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pencacahLabel.setText("Pencacah");

        namaPencacahLabel.setText("Nama                   :");

        jabatanPencacahLabel.setText("Jabatan                :");

        tanggalPencacahLabel.setText("Tanggal                :");

        tanggalPencacahField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        pengawasLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pengawasLabel.setText("Pengawas");

        namaPengawasLabel.setText("Nama                   :");

        jabatanPengawasLabel.setText("Jabatan                :");

        tanggalPencacahLabel1.setText("Tanggal                :");

        lanjutkanButton.setBackground(new java.awt.Color(102, 255, 102));
        lanjutkanButton.setForeground(new java.awt.Color(255, 255, 255));
        lanjutkanButton.setText("Lanjutkan");

        batalButton.setBackground(new java.awt.Color(255, 51, 51));
        batalButton.setForeground(new java.awt.Color(255, 255, 255));
        batalButton.setText("Mundur");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulKuesionerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactPersonLabel)
                    .addComponent(pencacahLabel)
                    .addComponent(pengawasLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jabatanCPLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jabatanCPField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namaCPLabel)
                                .addGap(84, 84, 84)
                                .addComponent(namaCPField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namaPengawasLabel)
                                    .addComponent(tanggalPencacahLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tanggalPencacahField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaPengawasField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(namaPencacahLabel)
                                                .addComponent(tanggalCPLabel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jabatanPencacahLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tanggalCPField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(namaPencacahField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jabatanPencacahField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jabatanPengawasLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jabatanPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tanggalPencacahLabel1)
                                .addGap(84, 84, 84)
                                .addComponent(tanggalPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(batalButton)
                .addGap(18, 18, 18)
                .addComponent(lanjutkanButton)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(judulKuesionerPanel)
                .addGap(33, 33, 33)
                .addComponent(contactPersonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaCPLabel)
                    .addComponent(namaCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatanCPLabel)
                    .addComponent(jabatanCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalCPLabel)
                    .addComponent(tanggalCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pencacahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPencacahLabel)
                    .addComponent(namaPencacahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatanPencacahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jabatanPencacahLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPencacahLabel)
                    .addComponent(tanggalPencacahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pengawasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPengawasLabel)
                    .addComponent(namaPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatanPengawasLabel)
                    .addComponent(jabatanPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPencacahLabel1)
                    .addComponent(tanggalPengawasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(batalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lanjutkanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batalButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JLabel contactPersonLabel;
    private javax.swing.JTextField jabatanCPField;
    private javax.swing.JLabel jabatanCPLabel;
    private javax.swing.JTextField jabatanPencacahField;
    private javax.swing.JLabel jabatanPencacahLabel;
    private javax.swing.JTextField jabatanPengawasField;
    private javax.swing.JLabel jabatanPengawasLabel;
    private javax.swing.JLabel judulKuesionerPanel;
    private javax.swing.JButton lanjutkanButton;
    private javax.swing.JTextField namaCPField;
    private javax.swing.JLabel namaCPLabel;
    private javax.swing.JTextField namaPencacahField;
    private javax.swing.JLabel namaPencacahLabel;
    private javax.swing.JTextField namaPengawasField;
    private javax.swing.JLabel namaPengawasLabel;
    private javax.swing.JLabel pencacahLabel;
    private javax.swing.JLabel pengawasLabel;
    private javax.swing.JFormattedTextField tanggalCPField;
    private javax.swing.JLabel tanggalCPLabel;
    private javax.swing.JFormattedTextField tanggalPencacahField;
    private javax.swing.JLabel tanggalPencacahLabel;
    private javax.swing.JLabel tanggalPencacahLabel1;
    private javax.swing.JFormattedTextField tanggalPengawasField;
    // End of variables declaration//GEN-END:variables
}
