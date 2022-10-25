package tn.esprit.GestionMagasin.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.GestionMagasin.entities.DetailProduit;

@Repository
public interface DetailProduitRepository extends JpaRepository<DetailProduit, Long>{

}
