package kata.supermarket.module.produit;

import java.util.List;

public class Panier implements Calculable {

    private List<Produit> produits;

    public double calculerTotal() {
        return produits.stream().mapToDouble(Produit::calculerTotal).sum();
    }

    void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    List<Produit> getProduits() {
        return produits;
    }
}
