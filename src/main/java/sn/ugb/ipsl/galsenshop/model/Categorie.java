/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Miki_Biboy
 */
@Entity
@NamedQueries(
    @NamedQuery(
            name="Categorie.findAll",
            query = "SELECT c FROM Categorie c"
    )
)
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code_categorie;
    
    @Column(nullable=false)
    private String nom;
    
    @Column(nullable=true)
    private String description;
    
    @Column(nullable=false)
    private double taux_tva;

    public Categorie() {
    }

    public Integer getCode_categorie() {
        return code_categorie;
    }

    public void setCode_categorie(Integer code_categorie) {
        this.code_categorie = code_categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTaux_tva() {
        return taux_tva;
    }

    public void setTaux_tva(Float taux_tva) {
        this.taux_tva = taux_tva;
    }

    public Categorie(Integer code_categorie, String nom, String description, double taux_tva) {
        this.code_categorie = code_categorie;
        this.nom = nom;
        this.description = description;
        this.taux_tva = taux_tva;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.code_categorie);
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
        final Categorie other = (Categorie) obj;
        return Objects.equals(this.code_categorie, other.code_categorie);
    }
    
    
    
}
