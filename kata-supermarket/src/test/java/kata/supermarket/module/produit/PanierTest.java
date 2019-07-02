package kata.supermarket.module.produit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static kata.supermarket.module.produit.MockObjectBuilder.buildPromotion;

public class PanierTest extends SuperMarketTest {

    @Test
    public void calculerTotal() {
        Panier panier = buildPanier();

        Assert.assertEquals(21, panier.calculerTotal(), 0.0001);
    }

    private Panier buildPanier() {
        Panier panier = new Panier();
        panier.setProduits(new ArrayList<>());
        panier.getProduits().add(produit1);
        panier.getProduits().add(produit2);
        panier.getProduits().add(produit3);
        panier.getProduits().add(produit4);
        panier.getProduits().add(produit5);
        return panier;
    }
}