/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Homer extends javax.swing.JFrame {

    /**
     * Creates new form Homer
     */
    public Homer(String nom_responsable) {
        initComponents();
        setUsers(nom_responsable);
    }
Homer() {
      throw new UnsupportedOperationException("Not supported yet.");  //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        utilisateurr = new javax.swing.JLabel();
        LogoutBtnr = new javax.swing.JButton();
        Statistiquer = new javax.swing.JButton();
        Statistiquemr = new javax.swing.JButton();
        ajoutu = new javax.swing.JButton();
        ajoutr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Welcome Back");

        utilisateurr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        utilisateurr.setForeground(new java.awt.Color(0, 204, 204));
        utilisateurr.setText("John");

        LogoutBtnr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogoutBtnr.setForeground(new java.awt.Color(0, 153, 153));
        LogoutBtnr.setText("Logout");
        LogoutBtnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnrActionPerformed(evt);
            }
        });

        Statistiquer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Statistiquer.setForeground(new java.awt.Color(0, 153, 153));
        Statistiquer.setText("Statististiques Annuelles");
        Statistiquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistiquerActionPerformed(evt);
            }
        });

        Statistiquemr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Statistiquemr.setForeground(new java.awt.Color(0, 153, 153));
        Statistiquemr.setText("Statististiques Monsuelles");
        Statistiquemr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistiquemrActionPerformed(evt);
            }
        });

        ajoutu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ajoutu.setForeground(new java.awt.Color(0, 153, 153));
        ajoutu.setText("Ajouter_utilisateur");
        ajoutu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutuActionPerformed(evt);
            }
        });

        ajoutr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ajoutr.setForeground(new java.awt.Color(0, 153, 153));
        ajoutr.setText("Ajouter_responsable");
        ajoutr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajoutu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajoutr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(utilisateurr, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(LogoutBtnr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Statistiquemr)
                            .addComponent(Statistiquer, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(utilisateurr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LogoutBtnr)
                .addGap(18, 18, 18)
                .addComponent(Statistiquer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Statistiquemr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutu)
                    .addComponent(ajoutr)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnrActionPerformed
        Loginr LoginrFrame = new Loginr();
        LoginrFrame.setVisible(true);
        LoginrFrame.pack();
        LoginrFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnrActionPerformed

    private void StatistiquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistiquerActionPerformed
        // TODO add your handling code here:
        StatistiquesAnnuelles StatistiquesAnnuellesFrame = new StatistiquesAnnuelles();
        StatistiquesAnnuellesFrame.setVisible(true);
        StatistiquesAnnuellesFrame.pack();
        StatistiquesAnnuellesFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_StatistiquerActionPerformed

    private void StatistiquemrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistiquemrActionPerformed
        // TODO add your handling code here:
        StatistiquesMensuelles  StatistiquesMensuellesFrame = new StatistiquesMensuelles ();
        StatistiquesMensuellesFrame.setVisible(true);
        StatistiquesMensuellesFrame.pack();
        StatistiquesMensuellesFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_StatistiquemrActionPerformed

    private void ajoutuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutuActionPerformed
        // TODO add your handling code here:
        SignUpu SignUpuFrame = new SignUpu();
        SignUpuFrame.setVisible(true);
        SignUpuFrame.pack();
        SignUpuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ajoutuActionPerformed

    private void ajoutrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutrActionPerformed
        // TODO add your handling code here:
        SignUpr SignUprFrame = new SignUpr();
        SignUprFrame.setVisible(true);
        SignUprFrame.pack();
        SignUprFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ajoutrActionPerformed

    /**
     * @param args the command line arguments
     */
     public void setUsers(String nom_responsable) {
    utilisateurr.setText(nom_responsable);
}
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
            java.util.logging.Logger.getLogger(Homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtnr;
    private javax.swing.JButton Statistiquemr;
    private javax.swing.JButton Statistiquer;
    private javax.swing.JButton ajoutr;
    private javax.swing.JButton ajoutu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel utilisateurr;
    // End of variables declaration//GEN-END:variables
}