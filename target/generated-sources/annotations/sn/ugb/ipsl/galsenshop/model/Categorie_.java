package sn.ugb.ipsl.galsenshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ugb.ipsl.galsenshop.model.Article;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-12-28T22:15:15")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, Integer> taux_tva;
    public static volatile SingularAttribute<Categorie, String> description;
    public static volatile SingularAttribute<Categorie, Integer> id;
    public static volatile SingularAttribute<Categorie, String> code_categorie;
    public static volatile SingularAttribute<Categorie, String> nom;
    public static volatile ListAttribute<Categorie, Article> articles;

}