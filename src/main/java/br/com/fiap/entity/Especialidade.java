package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="tb_especialidade1")
public class Especialidade {

	@Id
	@Column(name = "id_especialidade")
	@SequenceGenerator(name = "especialidade", sequenceName = "sq_tb_especialidade", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "especialidade")
	private int id;

	@Column(name = "nm_agendamento")
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
