package br.com.franca.domain.service;

import java.io.Serializable;
import java.util.Collection;

import br.com.franca.domain.model.UnidadeDeEnsino;

public interface UnidadeDeEnsinoService extends Serializable{

	/**
	 * 
	 * @return Cole��o Unidades com status Em Atividade;
	 */

	Collection<UnidadeDeEnsino> findAllStatusEmAtividade();
}
