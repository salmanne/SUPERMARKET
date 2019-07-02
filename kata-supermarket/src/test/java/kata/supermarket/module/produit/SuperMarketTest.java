package kata.supermarket.module.produit;

import kata.supermarket.module.promotion.Promotion;
import org.junit.Before;

import static kata.supermarket.module.produit.MockObjectBuilder.buildProduit;
import static kata.supermarket.module.produit.MockObjectBuilder.buildPromotion;

public class SuperMarketTest {

    Produit produit1;
    Produit produit2;
    Produit produit3;
    Produit produit4;
    Produit produit5;

    @Before
    public void buildMocks() {
        // Promotion 3 articles au prix de 2
        Promotion promotion = buildPromotion(3, 2, false);
        produit1 = buildProduit(10, 0.5, promotion);

        // Promotion 4 articles au prix de 3
        promotion = buildPromotion(4, 3, false);
        produit2 = buildProduit(4, 1.5, promotion);

        // Promotion 1 article à 2 euros, 3 articles à 5
        promotion = buildPromotion(3, 5, true);
        produit3 = buildProduit(3, 2, promotion);

        // Promotion reduction de 1 euros par article
        promotion = buildPromotion(1);
        produit4 = buildProduit(3, 2, promotion);

        // Pas de promotion
        produit5 = buildProduit(10, 0.5, null);
    }
}
