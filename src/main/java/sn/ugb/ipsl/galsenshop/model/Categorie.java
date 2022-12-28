/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ugb.ipsl.galsenshop.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    
    @Column(nullable=false)
    private String code_categorie;
    
    @Column(nullable=false)
    private String nom;
    
    @Column(nullable=true)
    private String description;
    
    
    private Integer taux_tva;
    
    @OneToMany(mappedBy="categorie")
    private List<Article> articles;
    
    @PrePersist // fonction pour initialiser le taux tva à 7% si elle n'est pas renseigné
    public void callBackTva(){
        if(this.taux_tva==null){
            this.taux_tva = 7;
        }
    }
    
    public Categorie() {
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode_categorie() {
        return code_categorie;
    }

    public void setCode_categorie(String code_categorie) {
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

    public Integer getTaux_tva() {
        return taux_tva;
    }

    public void setTaux_tva(Integer taux_tva) {
        this.taux_tva = taux_tva;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Categorie(String code_categorie, String nom, String description, Integer taux_tva) {
        this.code_categorie = code_categorie;
        this.nom = nom;
        this.description = description;
        this.taux_tva = taux_tva;
    }

    public Categorie(String code_categorie, String nom, String description) {
        this.code_categorie = code_categorie;
        this.nom = nom;
        this.description = description;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.code_categorie);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.code_categorie, other.code_categorie);
    }
    
    
    
    
    
}
