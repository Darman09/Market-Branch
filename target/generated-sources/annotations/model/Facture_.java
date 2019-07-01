package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Commande;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T14:36:01")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, Date> dateFacture;
    public static volatile SingularAttribute<Facture, Integer> idFacture;
    public static volatile SingularAttribute<Facture, Date> dateEchance;
    public static volatile SingularAttribute<Facture, Double> prixTotal;
    public static volatile SingularAttribute<Facture, Double> fraisPort;
    public static volatile SingularAttribute<Facture, Commande> idCommande;

}