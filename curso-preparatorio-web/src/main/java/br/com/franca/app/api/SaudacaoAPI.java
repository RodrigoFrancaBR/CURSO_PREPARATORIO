package br.com.franca.app.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("saudacao")
public interface SaudacaoAPI {

	@GET
	@Path("/{nome}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	String fazerSaudacao(@PathParam("nome") String nome);
}
