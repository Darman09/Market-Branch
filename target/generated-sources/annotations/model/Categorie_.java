package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.SousCategorie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> nomCategorie;
    public static volatile ListAttribute<Categorie, SousCategorie> sousCategorieList;
    public static volatile SingularAttribute<Categorie, Integer> idCategorie;

}