package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author mjule
 */
public class Scenario {

    Bandeau monBandeau = new Bandeau();
    public ArrayList<Effet> myEffets = new ArrayList<>();

    public void ajouterEffet(Effet effet) {
        myEffets.add(effet);
    }

    public void jouerScenario(Bandeau bandeau) {
        for (int i = 0; i < myEffets.size(); i++) {
            myEffets.get(i).executer();
        }
    }
}
