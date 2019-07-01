/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name = "vendeur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendeur.findAll", query = "SELECT v FROM Vendeur v")
    , @NamedQuery(name = "Vendeur.findByIdVendeur", query = "SELECT v FROM Vendeur v WHERE v.idVendeur = :idVendeur")
    , @NamedQuery(name = "Vendeur.findByNomVendeur", query = "SELECT v FROM Vendeur v WHERE v.nomVendeur = :nomVendeur")
    , @NamedQuery(name = "Vendeur.findByAdresseVendeur", query = "SELECT v FROM Vendeur v WHERE v.adresseVendeur = :adresseVendeur")
    , @NamedQuery(name = "Vendeur.findByCityVendeur", query = "SELECT v FROM Vendeur v WHERE v.cityVendeur = :cityVendeur")
    , @NamedQuery(name = "Vendeur.findByEmailVendeur", query = "SELECT v FROM Vendeur v WHERE v.emailVendeur = :emailVendeur")
    , @NamedQuery(name = "Vendeur.findByPhoneVendeur", query = "SELECT v FROM Vendeur v WHERE v.phoneVendeur = :phoneVendeur")
    , @NamedQuery(name = "Vendeur.findBySiteWebVendeur", query = "SELECT v FROM Vendeur v WHERE v.siteWebVendeur = :siteWebVendeur")
    , @NamedQuery(name = "Vendeur.findByInformationVendeur", query = "SELECT v FROM Vendeur v WHERE v.informationVendeur = :informationVendeur")})
public class Vendeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vendeur")
    private Integer idVendeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nom_vendeur")
    private String nomVendeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "adresse_vendeur")
    private String adresseVendeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "city_vendeur")
    private String cityVendeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email_vendeur")
    private String emailVendeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "phone_vendeur")
    private String phoneVendeur;
    @Size(max = 255)
    @Column(name = "site_web_vendeur")
    private String siteWebVendeur;
    @Size(max = 255)
    @Column(name = "information_vendeur")
    private String informationVendeur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVendeur")
    private List<Produit> produitList;
    @JoinColumn(name = "id_commission", referencedColumnName = "id_comission")
    @ManyToOne(optional = false)
    private Comission idCommission;

    public Vendeur() {
    }

    public Vendeur(Integer idVendeur) {
        this.idVendeur = idVendeur;
    }

    public Vendeur(Integer idVendeur, String nomVendeur, String adresseVendeur, String cityVendeur, String emailVendeur, String phoneVendeur) {
        this.idVendeur = idVendeur;
        this.nomVendeur = nomVendeur;
        this.adresseVendeur = adresseVendeur;
        this.cityVendeur = cityVendeur;
        this.emailVendeur = emailVendeur;
        this.phoneVendeur = phoneVendeur;
    }

    public Integer getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(Integer idVendeur) {
        this.idVendeur = idVendeur;
    }

    public String getNomVendeur() {
        return nomVendeur;
    }

    public void setNomVendeur(String nomVendeur) {
        this.nomVendeur = nomVendeur;
    }

    public String getAdresseVendeur() {
        return adresseVendeur;
    }

    public void setAdresseVendeur(String adresseVendeur) {
        this.adresseVendeur = adresseVendeur;
    }

    public String getCityVendeur() {
        return cityVendeur;
    }

    public void setCityVendeur(String cityVendeur) {
        this.cityVendeur = cityVendeur;
    }

    public String getEmailVendeur() {
        return emailVendeur;
    }

    public void setEmailVendeur(String emailVendeur) {
        this.emailVendeur = emailVendeur;
    }

    public String getPhoneVendeur() {
        return phoneVendeur;
    }

    public void setPhoneVendeur(String phoneVendeur) {
        this.phoneVendeur = phoneVendeur;
    }

    public String getSiteWebVendeur() {
        return siteWebVendeur;
    }

    public void setSiteWebVendeur(String siteWebVendeur) {
        this.siteWebVendeur = siteWebVendeur;
    }

    public String getInformationVendeur() {
        return informationVendeur;
    }

    public void setInformationVendeur(String informationVendeur) {
        this.informationVendeur = informationVendeur;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public Comission getIdCommission() {
        return idCommission;
    }

    public void setIdCommission(Comission idCommission) {
        this.idCommission = idCommission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVendeur != null ? idVendeur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendeur)) {
            return false;
        }
        Vendeur other = (Vendeur) object;
        if ((this.idVendeur == null && other.idVendeur != null) || (this.idVendeur != null && !this.idVendeur.equals(other.idVendeur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vendeur[ idVendeur=" + idVendeur + " ]";
    }
    
}
