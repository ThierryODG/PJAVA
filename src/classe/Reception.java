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
import java.time.LocalDate;

public class Reception {
    private Personne personne;
    private String numeroColis;
    private LocalDate dateReception;

    public Reception(Personne personne, String numeroColis, LocalDate dateReception) {
        this.personne = personne;
        this.numeroColis = numeroColis;
        this.dateReception = dateReception;
    }

    // Getters and setters here
}
