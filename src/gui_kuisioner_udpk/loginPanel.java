/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui_kuisioner_udpk;

import gui_kuisioner_udpk.frame_sebelumnya.homePanelFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author LENOVO
 */
public class loginPanel extends javax.swing.JPanel {

    private JScrollPane contentScrollPane;
    /**
     * Creates new form loginPanel
     */
    public loginPanel(JScrollPane contentScrollPane) {
        initComponents();
        this.contentScrollPane = contentScrollPane;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKeseluruhan = new javax.swing.JPanel();
        LogoBPS = new javax.swing.JLabel();
        Garuda = new javax.swing.JLabel();
        Indonesia = new javax.swing.JLabel();
        PanelRahasia = new javax.swing.JPanel();
        Rahasia = new javax.swing.JLabel();
        UDP = new javax.swing.JLabel();
        PanelTahun = new javax.swing.JPanel();
        Tahun = new javax.swing.JLabel();
        PanelKonstruksi = new javax.swing.JPanel();
        Konstruksi = new javax.swing.JLabel();
        NamaKuesioner = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        TextUsername = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        BPS = new javax.swing.JLabel();

        PanelKeseluruhan.setBackground(new java.awt.Color(255, 255, 255));

        LogoBPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/LogoBPS.jpg"))); // NOI18N

        Garuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_kuisioner_udpk/Gambar1.jpg"))); // NOI18N

        Indonesia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Indonesia.setText("REPUBLIK INDONESIA");

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
            .addGroup(PanelTahunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTahunLayout.setVerticalGroup(
            PanelTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tahun, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
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
            .addGroup(PanelKonstruksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Konstruksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKonstruksiLayout.setVerticalGroup(
            PanelKonstruksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Konstruksi, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        NamaKuesioner.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NamaKuesioner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaKuesioner.setText("UPDATING DIREKTORI PERUSAHAAN/USAHA KONSTRUKSI");
        NamaKuesioner.setToolTipText("");
        NamaKuesioner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Username.setText("Username");

        Password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password.setText("Password");

        TextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsernameActionPerformed(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        BPS.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        BPS.setForeground(new java.awt.Color(0, 0, 204));
        BPS.setText("BADAN PUSAT STATISTIK");

        javax.swing.GroupLayout PanelKeseluruhanLayout = new javax.swing.GroupLayout(PanelKeseluruhan);
        PanelKeseluruhan.setLayout(PanelKeseluruhanLayout);
        PanelKeseluruhanLayout.setHorizontalGroup(
            PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginButton)
                            .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextUsername)
                                    .addComponent(TextPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BPS))
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                                .addComponent(PanelRahasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(Garuda)
                                .addGap(71, 71, 71)
                                .addComponent(UDP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKeseluruhanLayout.createSequentialGroup()
                                .addComponent(Indonesia)
                                .addGap(60, 60, 60)))
                        .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelKonstruksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaKuesioner)
                            .addComponent(LogoBPS, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKeseluruhanLayout.setVerticalGroup(
            PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKeseluruhanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                                .addComponent(PanelRahasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKeseluruhanLayout.createSequentialGroup()
                                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Garuda)
                                    .addComponent(UDP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(Indonesia))
                    .addGroup(PanelKeseluruhanLayout.createSequentialGroup()
                        .addComponent(PanelKonstruksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaKuesioner)
                .addGap(50, 50, 50)
                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelKeseluruhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoBPS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPS))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKeseluruhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKeseluruhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsernameActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        contentScrollPane.setViewportView(new homePanel(contentScrollPane));
    }//GEN-LAST:event_LoginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BPS;
    private javax.swing.JLabel Garuda;
    private javax.swing.JLabel Indonesia;
    private javax.swing.JLabel Konstruksi;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LogoBPS;
    private javax.swing.JLabel NamaKuesioner;
    private javax.swing.JPanel PanelKeseluruhan;
    private javax.swing.JPanel PanelKonstruksi;
    private javax.swing.JPanel PanelRahasia;
    private javax.swing.JPanel PanelTahun;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Rahasia;
    private javax.swing.JLabel Tahun;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JLabel UDP;
    private javax.swing.JLabel Username;
    // End of variables declaration//GEN-END:variables
}
