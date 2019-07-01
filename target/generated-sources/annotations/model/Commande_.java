package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CommandeDetails;
import model.Facture;
import model.Utilisateur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Date> dateLivraison;
    public static volatile SingularAttribute<Commande, Utilisateur> idUtilisateur;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile ListAttribute<Commande, Facture> factureList;
    public static volatile SingularAttribute<Commande, Integer> idCommande;
    public static volatile ListAttribute<Commande, CommandeDetails> commandeDetailsList;

}