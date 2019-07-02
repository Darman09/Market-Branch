package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comission;
import model.Produit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T19:03:30")
@StaticMetamodel(Vendeur.class)
public class Vendeur_ { 

    public static volatile SingularAttribute<Vendeur, String> adresseVendeur;
    public static volatile SingularAttribute<Vendeur, Comission> idCommission;
    public static volatile SingularAttribute<Vendeur, Integer> idVendeur;
    public static volatile ListAttribute<Vendeur, Produit> produitList;
    public static volatile SingularAttribute<Vendeur, String> nomVendeur;
    public static volatile SingularAttribute<Vendeur, String> emailVendeur;
    public static volatile SingularAttribute<Vendeur, String> phoneVendeur;
    public static volatile SingularAttribute<Vendeur, String> cityVendeur;
    public static volatile SingularAttribute<Vendeur, String> siteWebVendeur;
    public static volatile SingularAttribute<Vendeur, String> informationVendeur;

}