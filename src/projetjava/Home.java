/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author HP
 */
public final class Home extends javax.swing.JFrame {

   

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

   public Home(String nom_utilisateur) {
        initComponents();
        setUser(nom_utilisateur);//To change body of generated methods, choose Tools | Templates.
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
        utilisateur = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        Suivantbtn = new javax.swing.JButton();
        Suivantbtn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("BIENVENUE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 47));

        utilisateur.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        utilisateur.setForeground(new java.awt.Color(0, 204, 204));
        utilisateur.setText("MENU");
        getContentPane().add(utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 153, 153));
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 310, -1));

        Suivantbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Suivantbtn.setForeground(new java.awt.Color(0, 153, 153));
        Suivantbtn.setText("Page colis");
        Suivantbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuivantbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Suivantbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 310, -1));

        Suivantbtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Suivantbtn1.setForeground(new java.awt.Color(0, 153, 153));
        Suivantbtn1.setText("Page reception");
        Suivantbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suivantbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Suivantbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 310, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 195, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 195, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 152));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\THIERRY\\Desktop\\Projetjava\\Projetjava\\src\\Icon\\Kia Seltos.jpeg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 730, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
              Login LoginFrame = new Login();
              LoginFrame.setVisible(true);
              LoginFrame.pack();
              LoginFrame.setLocationRelativeTo(null); 
              this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void SuivantbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuivantbtnActionPerformed
        // TODO add your handling code here:
        Menu MenuFrame = new Menu();
              MenuFrame.setVisible(true);
              MenuFrame.pack();
              MenuFrame.setLocationRelativeTo(null); 
              this.dispose();
    }//GEN-LAST:event_SuivantbtnActionPerformed

    private void Suivantbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suivantbtn1ActionPerformed
        // TODO add your handling code here:
        Reception ReceptionFrame = new Reception();
              ReceptionFrame.setVisible(true);
              ReceptionFrame.pack();
              ReceptionFrame.setLocationRelativeTo(null); 
              this.dispose();
    }//GEN-LAST:event_Suivantbtn1ActionPerformed
      
    public void setUser(String nom_utilisateur) {
    utilisateur.setText(nom_utilisateur);
}

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton Suivantbtn;
    private javax.swing.JButton Suivantbtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel utilisateur;
    // End of variables declaration//GEN-END:variables

}