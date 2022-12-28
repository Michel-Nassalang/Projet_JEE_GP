/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.metier;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import sn.ugb.ipsl.galsenshop.model.Categorie;

/**
 *
 * @author Miki_Biboy
 */
@Singleton
@Startup
@DependsOn({"StartAppBean"})
public class InitCategorie {

    @EJB
    private  CategorieFacade categorieFacade;
   
    @PostConstruct
    public void initialEtudiants(){
        System.out.println("#### Initialisation des categories ####");
        System.out.println("#### Nombre de categorie dans la base " + categorieFacade.count() + " ####");
        if(categorieFacade.count()==0){
            Categorie c1 = new Categorie(1, "Sac", "SAc de qualite avec des trousses et de nombreuses poches", 6.5);
            categorieFacade.create(c1);
            Categorie c2 = new Categorie(2,"Sous Vetements", "Fait avec un tissu en coton léger", 10.45);
            categorieFacade.create(c2);
            
            for (int i = 3; i < 10; i++) {
                Categorie cat = new Categorie(i,"Nom"+i,"Description"+i, 3.5+i);
                categorieFacade.create(cat);
            }
        }
    }
}
