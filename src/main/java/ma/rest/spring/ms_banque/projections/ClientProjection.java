package ma.rest.spring.ms_banque.projections;

import ma.rest.spring.ms_banque.entities.Client;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "clientDetails", types = Client.class)
public interface ClientProjection {
    String getNom();
    String getEmail();
}
