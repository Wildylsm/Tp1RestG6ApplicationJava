package net.emsi.tp1_rest_g6.Projection;


import net.emsi.tp1_rest_g6.enums.Genre;
import net.emsi.tp1_rest_g6.model.Etudiant;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "etudiantCentre", types = Etudiant.class)

    public interface EtudiantCentre {
        Long getId();

        String getNom();

        String getPrenom();

        Genre getGenre();

        CentreExcerpt getCentre();

        interface CentreExcerpt {
            Long getId();

            String getNom();

            String getAdresse();
        }
    }


