package br.com.franca.domain.service;

import java.util.Collection;

import br.com.franca.domain.model.UnidadeDeEnsino;

public interface UnidadeDeEnsinoService {

	/**
	 * 
	 * @return Coleção Unidades com status Em Atividade;
	 */

	Collection<UnidadeDeEnsino> findAllStatusEmAtividade();
}
