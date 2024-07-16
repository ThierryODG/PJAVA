/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class Colis {
    private String type_colis;
    private double poids;
    private String numero_envoi;
    private String nomE;
    private String prenomE;
    private String telephoneE;
    private String numero_pieceE;
    private String type_pieceE;
    private String villeE;
    private String nomD;
    private String prenomD;
    private String telephoneD;
    private String villeD;
    private Date date_envoi;
    private double coutEnvoi;
    private static int compteur = 0;

    public Colis(String type, double poids) {
        this.type_colis = type;
        this.poids = poids;
        this.numero_envoi = "COL" + (++compteur);
        this.nomE= nomE;
        this.prenomE = prenomE;
        this.telephoneE = telephoneE;
        this.numero_pieceE = numero_pieceE;
        this. type_pieceE =  type_pieceE;
        this.villeE = villeE;
        this.nomD = nomD;
        this.prenomD = prenomD;
        this.telephoneD = telephoneD;
        this.villeD = villeD;
         this.date_envoi = date_envoi;
         this.coutEnvoi = coutEnvoi;
    }

    public String getType() {
        return type_colis;
    }

    public double getPoids() {
        return poids;
    }

    public String getNumeroEnvoi() {
        return numero_envoi;
    }
    
    public String getnomEnvoyeur() {
        return nomE;
    }
    
    public String getprenomEnvoyeur() {
        return prenomE;
    }
    
    public String gettelephoneEnvoyeur() {
        return telephoneE;
    }
    
    public String getnumeroPieceEnvoyeur() {
        return numero_pieceE;
    }
    
     public String gettypePieceEnvoyeur () {
        return type_pieceE  ;
    }
     
     public String getvilleEnvoyeur () {
        return villeE;
    }
     
     public String getnomDestinataire () {
        return nomD ;
    }
     
     public String getprenomDestinataire () {
        return prenomD ;
    }
     
      public String gettelephoneDestinataire () {
        return telephoneD ;
    }
      
      public String getvilleDestinataire () {
        return villeD ;
    }
    
      public Date getdateEnvoi () {
        return date_envoi ;
    }
      
      public double getcoutEnvoi () {
        return coutEnvoi ;
    }
}