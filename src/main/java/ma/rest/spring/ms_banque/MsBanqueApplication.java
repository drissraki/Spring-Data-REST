package ma.rest.spring.ms_banque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.rest.spring.ms_banque.entities.*;
import ma.rest.spring.ms_banque.repositories.*;
import org.springframework.boot.*;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsBanqueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            CompteRepository compteRepository,
            ClientRepository clientRepository,
            RepositoryRestConfiguration restConfiguration) {

        return args -> {
            restConfiguration.exposeIdsFor(Compte.class, Client.class);

            Client c1 = clientRepository.save(new Client(null, "Amal", "amal@email.com", null));
            Client c2 = clientRepository.save(new Client(null, "Ali",  "ali@email.com", null));

            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE, c1));
            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.COURANT, c1));
            compteRepository.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE, c2));
        };
    }
}