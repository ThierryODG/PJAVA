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
import java.util.List;

public class Statistiques {
    private List<Colis> colisList;

    public Statistiques(List<Colis> colisList) {
        this.colisList = colisList;
    }

    public double calculerChiffreAffaires() {
        double total = 0;
        for (Colis colis : colisList) {
            total += Tarif.calculerCout(colis.getPoids());
        }
        return total;
    }

    public int getNombreColisEnvoyes() {
        return colisList.size();
    }
}
