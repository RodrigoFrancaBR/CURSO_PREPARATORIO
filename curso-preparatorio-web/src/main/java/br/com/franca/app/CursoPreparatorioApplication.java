package br.com.franca.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class CursoPreparatorioApplication extends ResourceConfig {
	public CursoPreparatorioApplication() {
		packages("br.com.franca.app.api");
	}
}
