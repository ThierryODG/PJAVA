/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import static projetjava.Menu.*;
import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class GestionColis {
   
    public static void enregistrer(String commande, String quantite) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GestionColis() {
    }
  public static void enregistrerColis(String type_colis, double poids,String numero_envoi,String nomE,String prenomE,String telephoneE,String numero_pieceE,String type_pieceE,String villeE,String nomD,
          String prenomD,String telephoneD,String villeD,String date_envoi,double coutEnvoi){
        try {
             c=connexionbd.seconnecter();
             st= c.createStatement();
             rs=st.executeQuery("SELECT * FROM colis WHERE type_colis='"+type_colis+"'");
            if(!rs.next()){
            st.executeUpdate("INSERT INTO colis(type_colis, poids, numero_envoi,nomE,prenomE,telephoneE,numero_pieceE,type_pieceE,villeE,nomD,prenomD,telephoneD,villeD,date_envoi,coutEnvoi) "
                    + "VALUES('"+type_colis+"','"+poids+"','"+numero_envoi+"','"+nomE+"','"+prenomE+"','"+telephoneE+"','"+numero_pieceE+"','"+type_pieceE+"','"+villeE+"','"+nomD+"','"+prenomD+"','"+telephoneD+"','"+villeD+"','"+date_envoi+"',"+coutEnvoi+")");
            JOptionPane.showMessageDialog(null, "enregistrement effectué");
            }
            else JOptionPane.showMessageDialog(null, type_colis+ " déja enregistré");
        } catch (Exception ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } 
  }
  public static void enregistrerReception(String numero_envoie,String nom_recepteur,String prenom_recepteur,String telephone_recepteur,String numero_piece_recepteur,String type_piece_recepteur,String date_reception,String nomEr, String prenomEr){
        try {
            c = connexionbd.seconnecter();
            st = c.createStatement();

            // Vérifier si le numéro d'envoi existe déjà dans la table reception
            rs = st.executeQuery("SELECT * FROM reception WHERE numero_envoie='" + numero_envoie + "'");
            if (!rs.next()) {
                // Vérifier si le numero_envoi, nomE et prenomE correspondent dans la table colis
                ResultSet rsColis = st.executeQuery("SELECT * FROM colis WHERE numero_envoi='" + numero_envoie + "' AND nomE='" + nomEr + "' AND prenomE='" + prenomEr + "'");
                if (rsColis.next()) {
                    // Insérer dans la table reception
                    st.executeUpdate("INSERT INTO reception(numero_envoie, nom_recepteur, prenom_recepteur, telephone_recepteur, numero_piece_recepteur, type_piece_recepteur, date_reception,nomEr,prenomEr) "
                            + "VALUES('" + numero_envoie + "','" + nom_recepteur + "','" + prenom_recepteur + "','" + telephone_recepteur + "','" + numero_piece_recepteur + "','" + type_piece_recepteur + "','" + date_reception + "','" + nomEr + "','" + prenomEr + "')");
                    JOptionPane.showMessageDialog(null, "Enregistrement effectué");
                } else {
                    JOptionPane.showMessageDialog(null, "Les informations fournies pour l'expéditeur ne correspondent pas.");
                }
            } else {
                JOptionPane.showMessageDialog(null, numero_envoie + " déjà enregistré");
            }
        } catch (Exception ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
       
  }
  public static void actualiser(DefaultTableModel tm){
        try {
            c=connexionbd.seconnecter();
            st=c.createStatement();
            rs=st.executeQuery("SELECT * FROM colis ORDER BY type_colis");
            int n=0;
            while(rs.next()){
                n++;
                tm.addRow(new Object[]{n, rs.getString("type_colis"),rs.getDouble("poids"),rs.getString("numero_envoi"),rs.getString("nomE"),rs.getString("prenomE"),rs.getString("telephoneE"),
                rs.getString("numero_pieceE"),rs.getString("type_pieceE"),rs.getString("villeE"),rs.getString("nomD"),rs.getString("prenomD"),rs.getString("telephoneD"),rs.getString("villeD"),rs.getDate("date_envoi"),rs.getDouble("coutEnvoi")});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
  public static void actualiserReception(DefaultTableModel tm){
        try {
            c=connexionbd.seconnecter();
            st=c.createStatement();
            rs=st.executeQuery("SELECT * FROM reception ORDER BY numero_envoie");
            int n=0;
            while(rs.next()){
                n++;
                tm.addRow(new Object[]{n, rs.getString("numero_envoie"),rs.getString("nom_recepteur"),rs.getString("prenom_recepteur"),rs.getString("telephone_recepteur"),rs.getString("numero_piece_recepteur"),rs.getString("type_piece_recepteur"),
                rs.getString("date_reception"),rs.getString("nomEr"),rs.getString("prenomEr")});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
  
    public static void modifier(String type_colis, double poids, String numero_envoi,String nomE,String prenomE,String telephoneE,String numero_pieceE,String type_pieceE,String villeE,
            String nomD,String prenomD,String telephoneD,String villeD,Date date_envoi,double cout_envoi){
        try { 
            c=connexionbd.seconnecter();
            st=c.createStatement();
            st.executeUpdate("UPDATE colis SET poids ='"+poids+"', numero_envoi="+numero_envoi+",nomE="+nomE+",prenomE="+prenomE+",telephoneE="+telephoneE+",numero_pieceE="+numero_pieceE+",type_pieceE="+type_pieceE+","
                    + "villeE="+villeE+",nomD="+nomD+",prenomD="+prenomD+",telephoneD="+telephoneD+",villeD="+villeD+",date_envoi="+date_envoi+",cout_envoi="+cout_envoi+" WHERE type_colis='"+type_colis+"'");
            JOptionPane.showMessageDialog(null, "colis modifié");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
         
}
    public static void modifierReception(String numero_envoie, String nom_recepteur,String prenom_recepteur,String telephone_recepteur,String numero_piece_recepteur,String type_piece_recepteur,String date_reception,String nomEr,
            String prenomEr){
        try { 
            c=connexionbd.seconnecter();
            st=c.createStatement();
            st.executeUpdate("UPDATE reception SET nom_recepteur='"+nom_recepteur+"', prenom_recepteur="+prenom_recepteur+",nomE="+prenom_recepteur+", telephone_recepteur="+ telephone_recepteur+",numero_piece_recepteur="+numero_piece_recepteur+",type_piece_recepteur="+type_piece_recepteur+",date_reception="+date_reception+","
                    + "nomEr="+nomEr+",prenomEr="+prenomEr+" WHERE numero_envoie='"+numero_envoie+"'");
            JOptionPane.showMessageDialog(null, "Reception modifiée");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
    }
    public static void supprimer(String GestionColis){
        try { 
            c=connexionbd.seconnecter();
            st=c.createStatement();
            st.executeUpdate("DELETE FROM colis WHERE type_colis='"+GestionColis+"'");
            JOptionPane.showMessageDialog(null, "colis supprimé");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void supprimerReception(String GestionColis){
        try { 
            c=connexionbd.seconnecter();
            st=c.createStatement();
            st.executeUpdate("DELETE FROM reception WHERE numero_envoi='"+GestionColis+"'");
            JOptionPane.showMessageDialog(null, "Reception supprimée");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static int getColisEnvoyesAnnuellement(int annee) {
    int totalColis = 0;
    try {
        Connection con = connexionbd.seconnecter();
        Statement st = con.createStatement();
        String query = "SELECT COUNT(*) FROM colis WHERE YEAR(date_envoi) = " + annee;
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            totalColis = rs.getInt(1);
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
    }
    return totalColis;
}
    
    public static int getColisEnvoyesMensuellement(int annee, int mois) {
    int totalColis = 0;
    try {
        Connection con = connexionbd.seconnecter();
        Statement st = con.createStatement();
        String query = "SELECT COUNT(*) FROM colis WHERE YEAR(date_envoi) = " + annee + " AND MONTH(date_envoi) = " + mois;
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            totalColis = rs.getInt(1);
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
    }
    return totalColis;
}
    
    public static double getChiffreAffairesAnnuel(int annee) {
    double totalCA = 0;
    try {
        Connection con = connexionbd.seconnecter();
        Statement st = con.createStatement();
        String query = "SELECT SUM(cout_envoi) FROM colis WHERE YEAR(date_envoi) = " + annee;
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            totalCA = rs.getDouble(1);
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
    }
    return totalCA;
}
    
    public static double getChiffreAffairesMensuel(int annee, int mois) {
    double totalCA = 0;
    try {
        Connection con = connexionbd.seconnecter();
        Statement st = con.createStatement();
        String query = "SELECT SUM(cout_envoi) FROM colis WHERE YEAR(date_envoi) = " + annee + " AND MONTH(date_envoi) = " + mois;
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
            totalCA = rs.getDouble(1);
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(GestionColis.class.getName()).log(Level.SEVERE, null, ex);
    }
    return totalCA;
}
}

