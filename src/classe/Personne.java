/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author HP
 */
public class Personne {
    private String nom;
    private String prenom;
    private String telephone;
    private String numeroPiece;
    private String typePiece;
    private String ville;

    public Personne(String nom, String prenom, String telephone, String numeroPiece, String typePiece, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.numeroPiece = numeroPiece;
        this.typePiece = typePiece;
        this.ville = ville;
    }

    // Getters and setters here
}