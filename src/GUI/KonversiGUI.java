package GUI;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDena
 * https://github.com/WrongCode-01?tab=repositories
 */
public class KonversiGUI extends javax.swing.JFrame {

    /**
     * Creates new form Konversi
     */
    public KonversiGUI() {
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

        LabelJudul21552011440 = new javax.swing.JLabel();
        LabelNilai21552011440 = new javax.swing.JLabel();
        jNilai21552011440 = new javax.swing.JTextField();
        LabelDari21552011440 = new javax.swing.JLabel();
        LabelKe21552011440 = new javax.swing.JLabel();
        jComboDari21552011440 = new javax.swing.JComboBox<>();
        jComboKe21552011440 = new javax.swing.JComboBox<>();
        jProses21552011440 = new javax.swing.JButton();
        LabelHasil21552011440 = new javax.swing.JLabel();
        jHasil21552011440 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelJudul21552011440.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelJudul21552011440.setText("Konversi Mata Uang ");

        LabelNilai21552011440.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNilai21552011440.setText("Nilai :");

        jNilai21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNilai21552011440ActionPerformed(evt);
            }
        });

        LabelDari21552011440.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDari21552011440.setText("Dari :");

        LabelKe21552011440.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelKe21552011440.setText("Ke :");

        jComboDari21552011440.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDR" }));

        jComboKe21552011440.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EURO", "RINGGIT", "DIRHAM", " " }));

        jProses21552011440.setText("Proses");
        jProses21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProses21552011440ActionPerformed(evt);
            }
        });

        LabelHasil21552011440.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelHasil21552011440.setText("Hasil :");

        jHasil21552011440.setEditable(false);
        jHasil21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHasil21552011440ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelHasil21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jHasil21552011440))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelNilai21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jNilai21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelDari21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboDari21552011440, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelKe21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboKe21552011440, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(LabelJudul21552011440))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jProses21552011440)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelJudul21552011440)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNilai21552011440)
                    .addComponent(jNilai21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDari21552011440)
                    .addComponent(jComboDari21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKe21552011440)
                    .addComponent(jComboKe21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProses21552011440)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHasil21552011440)
                    .addComponent(jHasil21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNilai21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNilai21552011440ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNilai21552011440ActionPerformed

    private void jHasil21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHasil21552011440ActionPerformed

    }//GEN-LAST:event_jHasil21552011440ActionPerformed

    private void jProses21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProses21552011440ActionPerformed
        Double nilai = Double.parseDouble(jNilai21552011440.getText());
        Double hasil;
        
        if(jComboDari21552011440.getSelectedItem().toString() == "IDR" && jComboKe21552011440.getSelectedItem().toString() == "USD")
        {
            hasil = nilai * 0.00007;
            jHasil21552011440.setText(String.valueOf(hasil));
        }
        else  if(jComboDari21552011440.getSelectedItem().toString() == "IDR" && jComboKe21552011440.getSelectedItem().toString() == "EURO")
        {
            hasil = nilai * 0.00063;
            jHasil21552011440.setText(String.valueOf(hasil));
        }
        else  if(jComboDari21552011440.getSelectedItem().toString() == "IDR" && jComboKe21552011440.getSelectedItem().toString() == "RINGGIT")
        {
            hasil = nilai * 0.00029;
            jHasil21552011440.setText(String.valueOf(hasil));
        }
        else  if(jComboDari21552011440.getSelectedItem().toString() == "IDR" && jComboKe21552011440.getSelectedItem().toString() == "DIRHAM")
        {
            hasil = nilai * 0.00026;
            jHasil21552011440.setText(String.valueOf(hasil));
        }   
    }//GEN-LAST:event_jProses21552011440ActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDari21552011440;
    private javax.swing.JLabel LabelHasil21552011440;
    private javax.swing.JLabel LabelJudul21552011440;
    private javax.swing.JLabel LabelKe21552011440;
    private javax.swing.JLabel LabelNilai21552011440;
    private javax.swing.JComboBox<String> jComboDari21552011440;
    private javax.swing.JComboBox<String> jComboKe21552011440;
    private javax.swing.JTextField jHasil21552011440;
    private javax.swing.JTextField jNilai21552011440;
    private javax.swing.JButton jProses21552011440;
    // End of variables declaration//GEN-END:variables
}
