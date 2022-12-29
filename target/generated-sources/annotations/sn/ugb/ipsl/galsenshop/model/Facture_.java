package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ugb.ipsl.galsenshop.model.Article;
import sn.ugb.ipsl.galsenshop.model.Caissier;
import sn.ugb.ipsl.galsenshop.model.Client;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-29T14:57:15")
@StaticMetamodel(Facture.class)
public class Facture_ { 

    public static volatile SingularAttribute<Facture, String> date;
    public static volatile SingularAttribute<Facture, Integer> idfacture;
    public static volatile SingularAttribute<Facture, Integer> nbproduits;
    public static volatile SingularAttribute<Facture, Caissier> caissier;
    public static volatile SingularAttribute<Facture, Float> montantHT;
    public static volatile SingularAttribute<Facture, Client> client;
    public static volatile SingularAttribute<Facture, Float> montantTTC;
    public static volatile ListAttribute<Facture, Article> articles;
    public static volatile SingularAttribute<Facture, Float> tva;

}