package tn.esprit.GestionMagasin.entities;


import tn.esprit.GestionMagasin.entities.CategorieProduit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity




public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="idDetailProduit")
    private Long idDetailProduit;
    
    private Date dateDerniereModification;

    private Date dateCreation;
    
    private CategorieProduit CategorieProduit;

}
