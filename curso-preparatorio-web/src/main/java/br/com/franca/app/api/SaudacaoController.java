package br.com.franca.app.api;

import javax.inject.Inject;

import br.com.franca.business.Saudacao;

public class SaudacaoController implements SaudacaoAPI {

	@Inject
	Saudacao saudacao;

	// Sem sucesso injetar um objeto do projeto service, que implementa uma
	// interface do projeto domain.
	// UnidadeDeEnsinoService unidadeDeEnsinoService;
	@Override
	public String fazerSaudacao(String nome) {
		System.out.println("OK");
		return saudacao.saudar(nome);
	}

}
