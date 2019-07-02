/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Produit;
import model.Utilisateur;
import utilities.Encode;

/**
 *
 * @author Darman
 */
public class SigninControler {

    EntityManager entityManager;
    EntityManagerFactory entityManagerFactory;

    public SigninControler() {
        entityManagerFactory = Persistence.createEntityManagerFactory("TeamworkPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public boolean checkUser(String login, String password) {
        try {
            Utilisateur user = (Utilisateur) entityManager.createNamedQuery("Utilisateur.findByNomUtilisateur").setParameter("mailUtilisateur", login).setParameter("mailUtilisateur", Encode.sha1(password)).getSingleResult();
            return user != null;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return false;
        }
    }
}
