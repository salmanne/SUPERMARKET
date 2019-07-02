package kata.supermarket.module.promotion;

import kata.supermarket.enums.TypePromotion;

public class Promotion {

    private String nom;
    private Facteur facteurGauche;
    private Facteur facteurDroite;
    private TypePromotion type;
    private double reduction;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Facteur getFacteurGauche() {
        return facteurGauche;
    }

    public void setFacteurGauche(Facteur facteurGauche) {
        this.facteurGauche = facteurGauche;
    }

    public Facteur getFacteurDroite() {
        return facteurDroite;
    }

    public void setFacteurDroite(Facteur facteurDroite) {
        this.facteurDroite = facteurDroite;
    }

    public TypePromotion getType() {
        return type;
    }

    public void setType(TypePromotion type) {
        this.type = type;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }
}
