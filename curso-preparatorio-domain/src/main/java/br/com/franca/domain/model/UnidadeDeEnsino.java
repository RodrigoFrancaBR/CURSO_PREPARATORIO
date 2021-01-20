package br.com.franca.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_unidade", uniqueConstraints = @UniqueConstraint(
		columnNames = { "nome","endereco" }, name = "nome_endereco_UK"))
@NamedQuery(name = "findByStatus", query = "SELECT u FROM UnidadeDeEnsino u WHERE u.status = :status ORDER BY u.nome ASC")
public class UnidadeDeEnsino implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5875337144608739087L;

	public static final String FIND_BY_STATUS = "findByStatus";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String endereco;
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeDeEnsino other = (UnidadeDeEnsino) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnidadeDeEnsino [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", status=" + status + "]";
	}

}
