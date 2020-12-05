/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author mjule
 */
public class Zoom extends Effet {

    int tailleFinale;

    public Zoom(Bandeau monBandeau, int tailleFinale) {
        super(monBandeau);
        this.tailleFinale = tailleFinale;
    }

    @Override
    public void executer() {
        for (int i = 5; i < tailleFinale; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, i + 5));
            monBandeau.sleep(100);
        }
    }
}
