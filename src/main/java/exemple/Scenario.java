package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author mjule
 */
public class Scenario {

    private Bandeau monBandeau = new Bandeau();
    private ArrayList<Effet> myEffets = new ArrayList<>();

    public void ajouterEffet(Effet effet) {
        myEffets.add(effet);
    }

    public void jouerScenario() {
        for (int i = 0; i < myEffets.size(); i++) {
            myEffets.get(i).executer();
        }
    }
}
