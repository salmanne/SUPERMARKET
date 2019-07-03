package kata.supermarket.module.produit;

import kata.supermarket.enums.TypePromotion;
import kata.supermarket.module.promotion.Promotion;

public class Ligne implements Calculable {

    private Produit produit;
    private double quantite;

    Ligne(Produit produit, double quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    @Override
    public double calculerTotal() {
        Promotion promotion = produit.getPromotion();
        if (promotion != null) {
            if (promotion.getType() == TypePromotion.SUR_PLUSIEURS) {
                return calculerPromotionSurPlusieurs();
            } else if (promotion.getType() == TypePromotion.REDUCTION) {
                return calculerPromotionReduction();
            }
        }
        return produit.getPrix() * quantite;
    }

    private double calculerPromotionReduction() {
        return (produit.getPrix() - produit.getPromotion().getReduction()) * quantite;
    }

    private double calculerPromotionSurPlusieurs() {
        Promotion promotion = produit.getPromotion();
        double prix = produit.getPrix();
        double facteurDroite = promotion.getFacteurDroite().getValeur();
        double facteurGauche = promotion.getFacteurGauche().getValeur();

        if (!promotion.getFacteurDroite().isStatics()) {
            facteurDroite = facteurDroite * prix;
        }
        return ((int) (quantite / facteurGauche)) * facteurDroite + ((quantite % facteurGauche) * prix);
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
