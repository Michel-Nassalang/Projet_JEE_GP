/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.metier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sn.ugb.ipsl.galsenshop.model.Facture;

/**
 *
 * @author Miki_Biboy
 */
public class FactureFacade extends AbstractFacade<Facture>{
    @PersistenceContext(unitName = "galsenShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FactureFacade() {
        super(Facture.class);
    }
    
    
}
