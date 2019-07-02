/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Categorie;
import model.Produit;
import model.SousCategorie;
import model.Vendeur;

/**
 *
 * @author Darman
 */
public class HomeControler {

    EntityManager entityManager;
    EntityManagerFactory entityManagerFactory;

    public HomeControler() {
        entityManagerFactory = Persistence.createEntityManagerFactory("TeamworkPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Categorie> getListCategories() {
        List<Categorie> categories = entityManager.createNamedQuery("Categorie.findAll").getResultList();
        return categories;
    }

    public Produit getUnitProduit(String id) {
        Produit produit = (Produit) entityManager.createNamedQuery("Produit.findByIdProduit").setParameter("idProduit", Integer.parseInt(id)).getSingleResult();
        return produit;
    }

    public List<Produit> getAllProduits() {
        List<Produit> produits = entityManager.createNamedQuery("Produit.findAll").getResultList();
        return produits;
    }

    public Map<Categorie, List<SousCategorie>> getSousCategoriesByCategorie() {
        Map<Categorie, List<SousCategorie>> map = new HashMap<>();
        List<Categorie> listCategories = entityManager.createNamedQuery("Categorie.findAll").getResultList();
        for (Categorie category : listCategories) {
            if (!map.containsKey(category)) {
                map.put(category, new LinkedList<SousCategorie>());
            }
            List<SousCategorie> subCategories = entityManager.createNamedQuery("SousCategorie.findByCategorie").setParameter("idCategorie", category).getResultList();
            for (SousCategorie subCategory : subCategories) {
                map.get(category).add(subCategory);
            }
        }
        return map;
    }

    public List<Produit> getVendeurProduits(Vendeur vendeur) {
        List<Produit> produits = entityManager.createNamedQuery("Produit.findByIdVendeur").setParameter("idVendeur", vendeur).getResultList();
        return produits;
    }
}
