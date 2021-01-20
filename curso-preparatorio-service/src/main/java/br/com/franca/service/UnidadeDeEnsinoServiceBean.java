package br.com.franca.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.franca.domain.model.UnidadeDeEnsino;
import br.com.franca.domain.service.UnidadeDeEnsinoService;
import br.com.franca.util.EntityManagerUtil;

// @Stateless sem sucesso 
public class UnidadeDeEnsinoServiceBean implements UnidadeDeEnsinoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 344143774010672659L;

	@Override
	public Collection<UnidadeDeEnsino> findAllStatusEmAtividade() {

		List<UnidadeDeEnsino> listaDeUnidades = new ArrayList<>();
		try {
			EntityManager em = EntityManagerUtil.getEntityManager();
			Query query = em.createNamedQuery(UnidadeDeEnsino.FIND_BY_STATUS);
			query.setParameter("status", "Em Atividade");

			if (query != null) {
				listaDeUnidades = query.getResultList();
			}

		} finally {
			// TODO: handle finally clause
		}

		return listaDeUnidades;
	}

}
