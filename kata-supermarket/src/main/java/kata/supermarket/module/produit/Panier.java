package kata.supermarket.module.produit;

import java.util.List;

public class Panier implements Calculable {

    private List<Ligne> lignes;

    public double calculerTotal() {
        return lignes.stream().mapToDouble(Ligne::calculerTotal).sum();
    }

    void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

    List<Ligne> getLignes() {
        return lignes;
    }
}
