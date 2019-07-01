package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Commande;
import model.Produit;
import model.StatusCommandeDetails;
import model.Transporteur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(CommandeDetails.class)
public class CommandeDetails_ { 

    public static volatile SingularAttribute<CommandeDetails, StatusCommandeDetails> idStatus;
    public static volatile SingularAttribute<CommandeDetails, Integer> quantiteProduit;
    public static volatile SingularAttribute<CommandeDetails, Produit> idProduit;
    public static volatile SingularAttribute<CommandeDetails, Integer> idCommandeDetails;
    public static volatile SingularAttribute<CommandeDetails, Double> codePromo;
    public static volatile SingularAttribute<CommandeDetails, Commande> idCommande;
    public static volatile SingularAttribute<CommandeDetails, Transporteur> idTransporteur;

}