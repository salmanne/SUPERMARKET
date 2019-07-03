package kata.supermarket.module.produit;


import kata.supermarket.module.promotion.Promotion;

public class Produit {

    private String nom;
    private double prix;
    private Promotion promotion;
    private double quantiteStock;

    double getPrix() {
        return prix;
    }

    void setPrix(double prix) {
        this.prix = prix;
    }

    Promotion getPromotion() {
        return promotion;
    }

    void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(double quantiteStock) {
        this.quantiteStock = quantiteStock;
    }
}
