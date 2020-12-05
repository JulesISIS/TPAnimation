package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();                                     //On créé un bandeau
        Scenario monScenario = new Scenario();                                  //On créé un scénario

        monScenario.ajouterEffet(new Zoom(monBandeau, 40));
        monScenario.ajouterEffet(new TourneHoraire(2, monBandeau));
        monScenario.ajouterEffet(new TourneAntiHoraire(3, monBandeau));
        monScenario.ajouterEffet(new ChangePolice(monBandeau));
        monScenario.ajouterEffet(new ChangeCouleurFond(monBandeau, Color.YELLOW));
        monScenario.ajouterEffet(new ChangeCouleurPolice(monBandeau, Color.MAGENTA));

        monScenario.jouerScenario();                                  //On exécute le scénario
    }
}