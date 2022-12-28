package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-28T13:18:41")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, String> date;
    public static volatile SingularAttribute<Facture, Integer> idfacture;
    public static volatile SingularAttribute<Facture, Integer> nbproduits;
    public static volatile SingularAttribute<Facture, Float> montantHT;
    public static volatile SingularAttribute<Facture, Float> montantTTC;
    public static volatile SingularAttribute<Facture, String> nom;
    public static volatile SingularAttribute<Facture, Float> tva;

}