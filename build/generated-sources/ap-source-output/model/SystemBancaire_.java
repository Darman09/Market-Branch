package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Utilisateur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T19:03:30")
@StaticMetamodel(SystemBancaire.class)
public class SystemBancaire_ { 

    public static volatile SingularAttribute<SystemBancaire, String> dateCarte;
    public static volatile SingularAttribute<SystemBancaire, Integer> idSystemBancaire;
    public static volatile SingularAttribute<SystemBancaire, String> numeroCarte;
    public static volatile SingularAttribute<SystemBancaire, String> cryptoCarte;
    public static volatile ListAttribute<SystemBancaire, Utilisateur> utilisateurList;

}