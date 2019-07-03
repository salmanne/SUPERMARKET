package kata.supermarket.module.produit;

import kata.supermarket.module.promotion.Promotion;
import org.junit.Before;

import java.util.ArrayList;

import static kata.supermarket.module.produit.MockObjectBuilder.*;

public class SuperMarketTest {

    Panier panier;
    Produit produit1;
    Produit produit2;
    Produit produit3;
    Produit produit4;
    Produit produit5;

    @Before
    public void buildMocks() {
        // Promotion 3 articles au prix de 2
        Promotion promotion = buildPromotion(3, 2, false);
        produit1 = buildProduit(0.5, 100, promotion);

        // Promotion 4 articles au prix de 3
        promotion = buildPromotion(4, 3, false);
        produit2 = buildProduit(1.5, 20, promotion);

        // Promotion 1 article à 2 euros, 3 articles à 5
        promotion = buildPromotion(3, 5, true);
        produit3 = buildProduit(2, 30, promotion);

        // Promotion reduction de 1 euros par article
        promotion = buildPromotion(1);
        produit4 = buildProduit(2, 40, promotion);

        // Pas de promotion
        produit5 = buildProduit(0.5, 50, null);

        panier = buildPanier();
    }

    private Panier buildPanier() {
        Panier panier = new Panier();
        panier.setLignes(new ArrayList<>());
        panier.getLignes().add(buildLigne(produit1, 10));
        panier.getLignes().add(buildLigne(produit2, 4));
        panier.getLignes().add(buildLigne(produit3, 3));
        panier.getLignes().add(buildLigne(produit4, 3));
        panier.getLignes().add(buildLigne(produit5, 10));
        return panier;
    }
}
