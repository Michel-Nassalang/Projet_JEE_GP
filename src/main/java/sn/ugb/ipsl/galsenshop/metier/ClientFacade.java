/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.metier;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sn.ugb.ipsl.galsenshop.model.Client;
import sn.ugb.ipsl.galsenshop.model.Facture;

/**
 *
 * @author Miki_Biboy
 */
public class ClientFacade extends AbstractFacade<Client>{
    @PersistenceContext(unitName = "galsenShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }
    
    // Fonction pour supprimer toutes les factures d'un client
    public void deleteFactures(Client client){
        List<Facture> factures = client.getFactures();
        FactureFacade factureFacade = new FactureFacade();
        for(Facture facture : factures){
            factureFacade.remove(facture);
        }
    }
    
}
