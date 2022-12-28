/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Miki_Biboy
 */
@Entity
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idfacture;
    private String nom;
    private Integer nbproduits;
    private Float montantHT;
    private Float tva;
    private Float montantTTC;
    private String date;

    public Integer getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(Integer idfacture) {
        this.idfacture = idfacture;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbproduits() {
        return nbproduits;
    }

    public void setNbproduits(Integer nbproduits) {
        this.nbproduits = nbproduits;
    }

    public Float getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(Float montantHT) {
        this.montantHT = montantHT;
    }

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }

    public Float getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(Float montantTTC) {
        this.montantTTC = montantTTC;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.idfacture);
        hash = 11 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Facture other = (Facture) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.idfacture, other.idfacture);
    }
    

    
    
}
