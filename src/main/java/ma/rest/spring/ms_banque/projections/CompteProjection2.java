package ma.rest.spring.ms_banque.projections;

import ma.rest.spring.ms_banque.entities.Compte;
import ma.rest.spring.ms_banque.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}
