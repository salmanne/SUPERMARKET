package kata.supermarket.module.produit;

import org.junit.Test;

import static kata.supermarket.module.produit.MockObjectBuilder.buildLigne;
import static org.junit.Assert.assertEquals;

public class ProduitTest extends SuperMarketTest {

    @Test
    public void testCalculerTotalPromo1Gratuit() {
        assertEquals(3.5, buildLigne(produit1, 10).calculerTotal(), 0.00001);
        assertEquals(4.5, buildLigne(produit2, 4).calculerTotal(), 0.00001);
        assertEquals(1.5, buildLigne(produit2, 1).calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalPromoReductionPlusieurs() {
        assertEquals(5, buildLigne(produit3, 3).calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalPromoReduction() {
        assertEquals(3, buildLigne(produit4, 3).calculerTotal(), 0.00001);
    }

    @Test
    public void testCalculerTotalSansPromo() {
        assertEquals(5, buildLigne(produit5, 10).calculerTotal(), 0.00001);
    }
}