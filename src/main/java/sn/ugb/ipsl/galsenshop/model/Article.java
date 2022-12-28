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
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code_article;
    private String libelle;
    private String description;
    private Integer prix_unitaire;
    private Integer unite_mesure;
    private Integer stock;

    public Integer getCode_article() {
        return code_article;
    }

    public void setCode_article(Integer code_article) {
        this.code_article = code_article;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(Integer prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public Integer getUnite_mesure() {
        return unite_mesure;
    }

    public void setUnite_mesure(Integer unite_mesure) {
        this.unite_mesure = unite_mesure;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.code_article);
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
        final Article other = (Article) obj;
        return Objects.equals(this.code_article, other.code_article);
    }

    
    
}
