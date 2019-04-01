package fr.epsi.eboutique.business.entity;

import java.util.List;

public class Marque {

  private List<Produit> produits;
  
  private Long identifier;
  
  private String libelle;

  public Long getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Long identifier) {
    this.identifier = identifier;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public List<Produit> getProduits() {
    return produits;
  }

  public void setProduits(List<Produit> produits) {
    this.produits = produits;
  }

}
