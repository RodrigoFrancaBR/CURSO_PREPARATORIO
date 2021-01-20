package br.com.franca.app.api;

public class SaudacaoController implements SaudacaoAPI {

	@Override
	public String fazerSaudacao(String nome) {
		return nome;
	}

}
