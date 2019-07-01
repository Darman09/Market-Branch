package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Commande;
import model.SystemBancaire;
import model.TypeUtilisateur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile ListAttribute<Utilisateur, Commande> commandeList;
    public static volatile SingularAttribute<Utilisateur, String> passwordUtilisateur;
    public static volatile SingularAttribute<Utilisateur, String> nomUtilisateur;
    public static volatile SingularAttribute<Utilisateur, String> mailUtilisateur;
    public static volatile SingularAttribute<Utilisateur, String> adresseFacturation;
    public static volatile SingularAttribute<Utilisateur, Integer> idUtilisateur;
    public static volatile SingularAttribute<Utilisateur, SystemBancaire> idSb;
    public static volatile SingularAttribute<Utilisateur, String> prenomUtilisateur;
    public static volatile SingularAttribute<Utilisateur, TypeUtilisateur> idTypeUtilisateur;
    public static volatile SingularAttribute<Utilisateur, String> adresseLivraison;

}