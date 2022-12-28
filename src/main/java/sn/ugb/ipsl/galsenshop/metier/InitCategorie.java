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
    public void initialCategorie(){
        System.out.println("#### Initialisation des categories ####");
        System.out.println("#### Nombre de categorie dans la base " + categorieFacade.count() + " ####");
        if(categorieFacade.count()==0){
            Categorie c1 = new Categorie("BSE", "biens sociaux essentiels", "les médicaments, appareils médico-chirurgicaux, le papier journal, les livres, les journaux, les fauteuils roulants, certains engrais etc.");
            categorieFacade.create(c1);
            
            Categorie c2 = new Categorie("BPN","biens de première nécessité","les matières premières de base, les biens d’équipement et les intrants spécifiques.",5);
            categorieFacade.create(c2);
            
            Categorie c3 = new Categorie("IPI","intrants et produits intermédiaires","",10);
            categorieFacade.create(c3);
            
            Categorie c4 = new Categorie("BCF","biens de consommation finale","catégorie par defaut", 20);
            categorieFacade.create(c4);
        }
    }
}
