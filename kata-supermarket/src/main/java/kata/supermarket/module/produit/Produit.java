package kata.supermarket.module.produit;


import kata.supermarket.enums.TypePromotion;
import kata.supermarket.module.promotion.Promotion;

public class Produit implements Calculable {

    private double prix;
    private Promotion promotion;
    private double quantite;

    public double calculerTotal() {
        if (promotion != null) {
            if (promotion.getType() == TypePromotion.SUR_PLUSIEURS) {
                return calculerPromotionSurPlusieurs();
            } else {
                return calculerPromotionReduction();
            }
        }
        return prix * quantite;
    }

    private double calculerPromotionReduction() {
        return (prix - promotion.getReduction()) * quantite;
    }

    private double calculerPromotionSurPlusieurs() {
        double facteurDroite = promotion.getFacteurDroite().getValeur();
        double facteurGauche = promotion.getFacteurGauche().getValeur();

        if (!promotion.getFacteurDroite().isStatics()) {
            facteurDroite = facteurDroite * prix;
        }
        return ((int) (quantite / facteurGauche)) * facteurDroite + ((quantite % facteurGauche) * prix);
    }

    public double getPrix() {
        return prix;
    }

    void setPrix(double prix) {
        this.prix = prix;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public double getQuantite() {
        return quantite;
    }

    void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
