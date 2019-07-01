/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Darman
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
    , @NamedQuery(name = "Produit.findByIdProduit", query = "SELECT p FROM Produit p WHERE p.idProduit = :idProduit")
    , @NamedQuery(name = "Produit.findByNameProduit", query = "SELECT p FROM Produit p WHERE p.nameProduit = :nameProduit")
    , @NamedQuery(name = "Produit.findByProductCode", query = "SELECT p FROM Produit p WHERE p.productCode = :productCode")
    , @NamedQuery(name = "Produit.findByDescriptionProduit", query = "SELECT p FROM Produit p WHERE p.descriptionProduit = :descriptionProduit")
    , @NamedQuery(name = "Produit.findByPrixStandartProduit", query = "SELECT p FROM Produit p WHERE p.prixStandartProduit = :prixStandartProduit")
    , @NamedQuery(name = "Produit.findByQuantiteUnitaireProduit", query = "SELECT p FROM Produit p WHERE p.quantiteUnitaireProduit = :quantiteUnitaireProduit")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produit")
    private Integer idProduit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name_produit")
    private String nameProduit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "product_code")
    private String productCode;
    @Size(max = 255)
    @Column(name = "description_produit")
    private String descriptionProduit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prix_standart_produit")
    private BigDecimal prixStandartProduit;
    @Column(name = "quantite_unitaire_produit")
    private Integer quantiteUnitaireProduit;
    @JoinColumn(name = "id_sous_categorie_produit", referencedColumnName = "id_sous_categorie")
    @ManyToOne(optional = false)
    private SousCategorie idSousCategorieProduit;
    @JoinColumn(name = "id_vendeur", referencedColumnName = "id_vendeur")
    @ManyToOne(optional = false)
    private Vendeur idVendeur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduit")
    private List<CommandeDetails> commandeDetailsList;
    @OneToMany(mappedBy = "idProduit")
    private List<CommentaireUser> commentaireUserList;

    public Produit() {
    }

    public Produit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public Produit(Integer idProduit, String nameProduit, String productCode) {
        this.idProduit = idProduit;
        this.nameProduit = nameProduit;
        this.productCode = productCode;
    }

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getNameProduit() {
        return nameProduit;
    }

    public void setNameProduit(String nameProduit) {
        this.nameProduit = nameProduit;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public BigDecimal getPrixStandartProduit() {
        return prixStandartProduit;
    }

    public void setPrixStandartProduit(BigDecimal prixStandartProduit) {
        this.prixStandartProduit = prixStandartProduit;
    }

    public Integer getQuantiteUnitaireProduit() {
        return quantiteUnitaireProduit;
    }

    public void setQuantiteUnitaireProduit(Integer quantiteUnitaireProduit) {
        this.quantiteUnitaireProduit = quantiteUnitaireProduit;
    }

    public SousCategorie getIdSousCategorieProduit() {
        return idSousCategorieProduit;
    }

    public void setIdSousCategorieProduit(SousCategorie idSousCategorieProduit) {
        this.idSousCategorieProduit = idSousCategorieProduit;
    }

    public Vendeur getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(Vendeur idVendeur) {
        this.idVendeur = idVendeur;
    }

    @XmlTransient
    public List<CommandeDetails> getCommandeDetailsList() {
        return commandeDetailsList;
    }

    public void setCommandeDetailsList(List<CommandeDetails> commandeDetailsList) {
        this.commandeDetailsList = commandeDetailsList;
    }

    @XmlTransient
    public List<CommentaireUser> getCommentaireUserList() {
        return commentaireUserList;
    }

    public void setCommentaireUserList(List<CommentaireUser> commentaireUserList) {
        this.commentaireUserList = commentaireUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduit != null ? idProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idProduit == null && other.idProduit != null) || (this.idProduit != null && !this.idProduit.equals(other.idProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produit[ idProduit=" + idProduit + " ]";
    }
    
}
