package br.com.persistenciaJpql.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_especialidade")
public class Especialidade {

	private int id;

	private String nomeAgendamento;

	public Especialidade() {
		super();
	}

	public Especialidade(int id, String nomeAgendamento) {
		super();
		this.id = id;
		this.nomeAgendamento = nomeAgendamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeAgendamento() {
		return nomeAgendamento;
	}

	public void setNomeAgendamento(String nomeAgendamento) {
		this.nomeAgendamento = nomeAgendamento;
	}

}
