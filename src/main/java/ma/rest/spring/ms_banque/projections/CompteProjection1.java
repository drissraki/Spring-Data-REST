package ma.rest.spring.ms_banque.projections;

import ma.rest.spring.ms_banque.entities.Compte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
public interface CompteProjection1 {
    double getSolde();
}
