package kata.supermarket.module.promotion;

public class Facteur {

    private double valeur;
    private boolean statics;

    public Facteur(double valeur, boolean statics) {
        this.valeur = valeur;
        this.statics = statics;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public boolean isStatics() {
        return statics;
    }

    public void setStatics(boolean statics) {
        this.statics = statics;
    }
}
