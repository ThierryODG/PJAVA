/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import classe.GestionColis;
import java.awt.GridLayout;
import java.sql.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


/**
 *
 * @author HP
 */
public class StatistiquesAnnuelles extends javax.swing.JFrame {
    private JTextField anneeField;
    private JLabel totalColisLabel;
    private JLabel chiffreAffairesLabel;
    private JLabel label_image1;
    private JPanel panneau_impression1;
    /**
     * Creates new form StatistiquesAnnuelles
     */
       
    
    public StatistiquesAnnuelles() {
        initComponents();
        setTitle("Statistiques Annuelles");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panneau_impression1 = new JPanel(new GridLayout(5, 2)); // Panel pour les entrées et résultats
        JPanel buttonPanel = new JPanel(); // Panel pour les boutons d'impression

        anneeField = new JTextField();
        totalColisLabel = new JLabel("Total Colis: ");
        chiffreAffairesLabel = new JLabel("Chiffre d'affaires: ");
        label_image1 = new JLabel(); // Label pour afficher l'image

        JButton calculerButton = new JButton("Calculer");
        calculerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int annee = Integer.parseInt(anneeField.getText());
                    int totalColis = GestionColis.getColisEnvoyesAnnuellement(annee);
                    double chiffreAffaires = GestionColis.getChiffreAffairesAnnuel(annee);

                    totalColisLabel.setText("Total Colis: " + totalColis);
                    chiffreAffairesLabel.setText("Chiffre d'affaires: " + chiffreAffaires + " DH");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer une année valide.", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ajouter les composants au panel d'entrée
        panneau_impression1.add(new JLabel("Année:"));
        panneau_impression1.add(anneeField);
        panneau_impression1.add(new JLabel("Résultats:"));
        panneau_impression1.add(new JLabel()); // Ligne vide pour espacement
        panneau_impression1.add(totalColisLabel);
        panneau_impression1.add(chiffreAffairesLabel);
        panneau_impression1.add(new JLabel()); // Ligne vide pour espacement
        panneau_impression1.add(calculerButton);
        panneau_impression1.add(new JLabel("Image:"));
        panneau_impression1.add(label_image1);

        // Boutons "Charger impression" et "Impression"
        JButton chargerImpressionButton = new JButton("Charger impression");
        JButton impressionButton = new JButton("Impression");
        JButton retourHomeButton = new JButton("Retour à Home");

        // Action pour le bouton "Charger"
        chargerImpressionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser f = new JFileChooser();
                    f.showDialog(null, "Charger Signature");
                    File fichier = f.getSelectedFile();
                    BufferedImage img = ImageIO.read(fichier);
                    Image dimg = img.getScaledInstance(label_image1.getWidth(), label_image1.getHeight(), Image.SCALE_SMOOTH);
                    label_image1.setIcon(new ImageIcon(dimg));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erreur chargement signature !");
                }
            }
        });

        // Action pour le bouton "Impression"
        impressionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit kit_par_defaut = Toolkit.getDefaultToolkit();
                PrintJob pj = kit_par_defaut.getPrintJob(StatistiquesAnnuelles.this, "Impression", null);
                Graphics g = pj.getGraphics();
                panneau_impression1.printAll(g);
                pj.end();
            }
        });

        // Action pour le bouton "Retour à Home"
        retourHomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code pour retourner à la page Home
                Home homeFrame = new Home();
                homeFrame.setVisible(true);
                homeFrame.pack();
                homeFrame.setLocationRelativeTo(null);
                dispose();
            }
        });

        // Ajout des boutons au panel des boutons
        buttonPanel.add(chargerImpressionButton);
        buttonPanel.add(impressionButton);
        buttonPanel.add(retourHomeButton);

        // Ajouter les panels à la fenêtre principale
        add(panneau_impression1, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StatistiquesAnnuelles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatistiquesAnnuelles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatistiquesAnnuelles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatistiquesAnnuelles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistiquesAnnuelles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
