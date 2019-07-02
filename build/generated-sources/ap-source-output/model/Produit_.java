package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CommandeDetails;
import model.CommentaireUser;
import model.SousCategorie;
import model.Vendeur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T19:03:30")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Integer> quantiteUnitaireProduit;
    public static volatile SingularAttribute<Produit, String> descriptionProduit;
    public static volatile SingularAttribute<Produit, Integer> idProduit;
    public static volatile SingularAttribute<Produit, String> productCode;
    public static volatile SingularAttribute<Produit, SousCategorie> idSousCategorieProduit;
    public static volatile ListAttribute<Produit, CommentaireUser> commentaireUserList;
    public static volatile SingularAttribute<Produit, String> nameProduit;
    public static volatile SingularAttribute<Produit, BigDecimal> prixStandartProduit;
    public static volatile SingularAttribute<Produit, Vendeur> idVendeur;
    public static volatile ListAttribute<Produit, CommandeDetails> commandeDetailsList;

}