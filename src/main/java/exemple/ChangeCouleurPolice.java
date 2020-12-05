/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author mjule
 */
public class ChangeCouleurPolice extends Effet {

    Color newColor;

    public ChangeCouleurPolice(Bandeau monBandeau, Color newColor) {
        super(monBandeau);
        this.newColor = newColor;
    }

    @Override
    public void executer() {
        monBandeau.sleep(1000);
        monBandeau.setForeground(newColor);
    }
}
