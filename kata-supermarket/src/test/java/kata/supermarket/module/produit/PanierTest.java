package kata.supermarket.module.produit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static kata.supermarket.module.produit.MockObjectBuilder.buildPromotion;

public class PanierTest extends SuperMarketTest {

    @Test
    public void calculerTotal() {
        Assert.assertEquals(21, panier.calculerTotal(), 0.0001);
    }
}