package br.com.franca;

import javax.persistence.EntityManager;

import br.com.franca.domain.UnidadeDeEnsino;
import br.com.franca.util.EntityManagerUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello WOrld");
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		UnidadeDeEnsino find = entityManager.find(UnidadeDeEnsino.class, 1l);
		System.out.println(find);
		entityManager.clear();
	}

}
