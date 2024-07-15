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
public class Tarif {
    private static final double TARIF_BASE = 1000; // Tarif de base par kg

    public static double calculerCout(double poids) {
        return TARIF_BASE * poids;
    }
}
