package net.emsi.tp1_rest_g6.repository;


import net.emsi.tp1_rest_g6.Projection.EtudiantCentre;
import net.emsi.tp1_rest_g6.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "students", excerptProjection = EtudiantCentre.class)
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantByNom(@Param("nom") String nom);
}
