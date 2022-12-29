package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ugb.ipsl.galsenshop.model.Categorie;
import sn.ugb.ipsl.galsenshop.model.Client;
import sn.ugb.ipsl.galsenshop.model.Facture;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-29T14:57:15")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, Integer> code_article;
    public static volatile SingularAttribute<Article, Categorie> categorie;
    public static volatile ListAttribute<Article, Client> clients;
    public static volatile SingularAttribute<Article, String> libelle;
    public static volatile SingularAttribute<Article, Integer> unite_mesure;
    public static volatile SingularAttribute<Article, String> description;
    public static volatile ListAttribute<Article, Facture> factures;
    public static volatile SingularAttribute<Article, Integer> stock;
    public static volatile SingularAttribute<Article, Integer> prix_unitaire;

}