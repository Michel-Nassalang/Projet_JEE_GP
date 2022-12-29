package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ugb.ipsl.galsenshop.model.Facture;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-29T14:57:15")
@StaticMetamodel(Caissier.class)
public class Caissier_ { 

    public static volatile SingularAttribute<Caissier, String> date;
    public static volatile SingularAttribute<Caissier, Integer> matricule;
    public static volatile ListAttribute<Caissier, Facture> factures;
    public static volatile SingularAttribute<Caissier, String> prenom;
    public static volatile SingularAttribute<Caissier, String> nom;

}