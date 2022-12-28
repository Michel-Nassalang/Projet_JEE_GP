/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.metier;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sn.ugb.ipsl.galsenshop.model.Categorie;

/**
 *
 * @author Miki_Biboy
 */
@Stateless
public class CategorieFacade extends AbstractFacade<Categorie>{
    @PersistenceContext(unitName = "galsenShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieFacade() {
        super(Categorie.class);
    }

    public List<Categorie> load(int numpage, int taille) {
        Query q = em.createNamedQuery("Categorie.findAll");
        int firstResult = (numpage - 1)*taille;
        q.setFirstResult(firstResult );
        q.setMaxResults(taille);
        return q.getResultList();
    }
    
}
