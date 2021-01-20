package br.com.franca;

import javax.persistence.EntityManager;

import br.com.franca.domain.Turma;
import br.com.franca.domain.UnidadeDeEnsino;
import br.com.franca.util.EntityManagerUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello WOrld");
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		UnidadeDeEnsino find1 = entityManager.find(UnidadeDeEnsino.class, 1l);
		Turma find2 = entityManager.find(Turma.class, 2l);
		Turma find3 = entityManager.find(Turma.class, 3l);
		System.out.println(find1.toString());
		System.out.println(find2.toString());
		System.out.println(find3.toString());
		entityManager.clear();
	}

}
