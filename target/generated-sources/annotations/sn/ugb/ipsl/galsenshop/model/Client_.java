package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ugb.ipsl.galsenshop.model.Article;
import sn.ugb.ipsl.galsenshop.model.Facture;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-28T22:15:15")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile ListAttribute<Client, Facture> factures;
    public static volatile SingularAttribute<Client, Integer> idclient;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile ListAttribute<Client, Article> articles;

}