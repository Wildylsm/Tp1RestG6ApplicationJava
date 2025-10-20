package net.emsi.tp1_rest_g6;


import net.emsi.tp1_rest_g6.enums.Genre;
import net.emsi.tp1_rest_g6.model.Centre;
import net.emsi.tp1_rest_g6.model.Etudiant;
import net.emsi.tp1_rest_g6.repository.CentreRepository;
import net.emsi.tp1_rest_g6.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1RestG6Application implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tp1RestG6Application.class, args);
    }



    @Override
    public void run(String... args) throws Exception {



        Centre centre1 = centreRepository.save(Centre.builder()
                .nom("EMSI ROUDANI")
                .adresse("Roudani")
                .build()
        );

        etudiantRepository.save(Etudiant.builder()
                .nom("Moukhtar")
                .prenom("Ouiam")
                .genre(Genre.Femme)
                        .centre(centre1)
                .build());

        etudiantRepository.save(Etudiant.builder()
                .nom("Lestoun")
                .prenom("Aya")
                .genre(Genre.Femme)
                .centre(centre1)
                .build());

        etudiantRepository.save(Etudiant.builder()
                .nom("Idriss")
                .prenom("Idriss")
                .genre(Genre.Homme)
                .centre(centre1)
                .build());
    }
}
