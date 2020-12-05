/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author mjule
 */
public class TourneHoraire extends Effet {

    int repetition;
    
    public TourneHoraire(int repetition, Bandeau monBandeau) {
        super(monBandeau);
        this.repetition = repetition;
    }

    @Override
    public void executer() {
        for (int j = 0; j < repetition; j++) {
            for (int i = 0; i <= 100; i++) {
                monBandeau.setRotation(2 * Math.PI * i / 100);
                monBandeau.sleep(30);
            }
        }
    }
}
