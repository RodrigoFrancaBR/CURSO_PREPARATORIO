package br.com.franca.main;

import java.util.Collection;

import br.com.franca.domain.model.UnidadeDeEnsino;
import br.com.franca.service.UnidadeDeEnsinoServiceBean;

public class Main {

	public static void main(String[] args) {
		UnidadeDeEnsinoServiceBean serviceBean = new UnidadeDeEnsinoServiceBean();
		Collection<UnidadeDeEnsino> findAllStatusEmAtividade = serviceBean.findAllStatusEmAtividade();
		findAllStatusEmAtividade.forEach((e)->System.out.println(e.toString()));
	}

}
