package br.com.franca.business;

public class SaudacaoSimples implements Saudacao {

	@Override
	public String saudar(String nome) {
		return "Olá " + nome;
	}

}
