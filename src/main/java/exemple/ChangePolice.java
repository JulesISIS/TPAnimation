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
public class ChangePolice extends Effet {

    public ChangePolice(Bandeau monBandeau) {
        super(monBandeau);
    }

    @Override
    public void executer() {
        monBandeau.setFont(new Font("Roman_Baseline", Font.ROMAN_BASELINE, 40));
        monBandeau.sleep(100);
    }
}
