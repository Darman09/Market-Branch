package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Categorie;
import model.Produit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(SousCategorie.class)
public class SousCategorie_ { 

    public static volatile ListAttribute<SousCategorie, Produit> produitList;
    public static volatile SingularAttribute<SousCategorie, Categorie> idCategorie;
    public static volatile SingularAttribute<SousCategorie, String> nomSousCategorie;
    public static volatile SingularAttribute<SousCategorie, Integer> idSousCategorie;

}