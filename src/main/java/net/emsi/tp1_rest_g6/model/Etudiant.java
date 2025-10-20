package net.emsi.tp1_rest_g6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.emsi.tp1_rest_g6.enums.Genre;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Table(name="etudiants")
    public class Etudiant {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        @Column(name="nom_etudiant", nullable=false)
        String nom;
        @Column(name="prenom_etudiant")
        String prenom;
        @Enumerated(EnumType.STRING)
        Genre genre;
        @ManyToOne
        @JoinColumn(name = "centre_id")
        private Centre centre;





    }

