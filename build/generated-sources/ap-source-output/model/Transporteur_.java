package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CommandeDetails;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T19:03:30")
@StaticMetamodel(Transporteur.class)
public class Transporteur_ { 

    public static volatile SingularAttribute<Transporteur, String> siteWebTransporteur;
    public static volatile SingularAttribute<Transporteur, String> nomTransporteur;
    public static volatile SingularAttribute<Transporteur, String> adresseTransporteur;
    public static volatile SingularAttribute<Transporteur, String> cityTransporteur;
    public static volatile ListAttribute<Transporteur, CommandeDetails> commandeDetailsList;
    public static volatile SingularAttribute<Transporteur, Integer> idTransporteur;

}