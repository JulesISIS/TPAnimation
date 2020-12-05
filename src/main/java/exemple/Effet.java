package exemple;

import bandeau.Bandeau;

/**
 *
 * @author mjule
 */
public abstract class Effet {

    Bandeau monBandeau;

    public Effet(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }
    
    public abstract void executer();
}
