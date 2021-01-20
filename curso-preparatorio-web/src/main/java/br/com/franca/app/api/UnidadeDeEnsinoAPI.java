package br.com.franca.app.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("unidadesDeEnsino")
public interface UnidadeDeEnsinoAPI {
	
	@GET
	@Path("EmAtividade")
	@Produces(MediaType.APPLICATION_JSON)
	Response findAllUnidadesDeEnsinoWithStatusEmAtividade();
}
