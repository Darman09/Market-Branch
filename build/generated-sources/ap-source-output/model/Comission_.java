package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Vendeur;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-01T19:03:30")
@StaticMetamodel(Comission.class)
public class Comission_ { 

    public static volatile SingularAttribute<Comission, Integer> idComission;
    public static volatile ListAttribute<Comission, Vendeur> vendeurList;
    public static volatile SingularAttribute<Comission, Double> pourcentageComission;

}