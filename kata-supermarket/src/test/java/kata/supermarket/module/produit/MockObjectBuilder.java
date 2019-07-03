package kata.supermarket.module.produit;

import kata.supermarket.enums.TypePromotion;
import kata.supermarket.module.promotion.Facteur;
import kata.supermarket.module.promotion.Promotion;

class MockObjectBuilder {

    static Produit buildProduit(double prix, double quantiteStock, Promotion promotion) {
        Produit produit = new Produit();
        produit.setPrix(prix);
        produit.setPromotion(promotion);
        return produit;
    }

    static Promotion buildPromotion(int facteurGauche, double facteurDroite, boolean isStatic) {
        Promotion promotion = new Promotion();
        promotion.setFacteurGauche(new Facteur(facteurGauche, false));
        promotion.setFacteurDroite(new Facteur(facteurDroite, isStatic));
        promotion.setType(TypePromotion.SUR_PLUSIEURS);
        return promotion;
    }

    static Promotion buildPromotion(double reduction) {
        Promotion promotion = new Promotion();
        promotion.setReduction(reduction);
        promotion.setType(TypePromotion.REDUCTION);
        return promotion;
    }

    static Ligne buildLigne(Produit produit, double quantite) {
        return new Ligne(produit, quantite);
    }
}
