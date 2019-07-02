package kata.supermarket.module.produit;

import kata.supermarket.module.promotion.Promotion;
import org.junit.Test;

import static kata.supermarket.module.produit.MockObjectBuilder.buildProduit;
import static kata.supermarket.module.produit.MockObjectBuilder.buildPromotion;
import static org.junit.Assert.assertEquals;

public class ProduitTest extends SuperMarketTest {

    @Test
    public void testCalculerTotalPromo1Gratuit() {
        assertEquals(3.5, produit1.calculerTotal(), 0.00001);
        assertEquals(4.5, produit2.calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalPromoReductionPlusieurs() {
        assertEquals(5, produit3.calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalPromoReduction() {
        assertEquals(3, produit4.calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalSansPromo() {
        assertEquals(5, produit5.calculerTotal(), 0.00001);
    }
}