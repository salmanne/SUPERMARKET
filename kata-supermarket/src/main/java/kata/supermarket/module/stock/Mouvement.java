package kata.supermarket.module.stock;

import kata.supermarket.enums.TypeMouvement;
import kata.supermarket.module.produit.Produit;

public class Mouvement {

    private Produit produit;
    private TypeMouvement type;
    private double quantite;

    public Mouvement(Produit produit, TypeMouvement type, double quantite) {
        this.produit = produit;
        this.type = type;
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public TypeMouvement getType() {
        return type;
    }

    public void setType(TypeMouvement type) {
        this.type = type;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
