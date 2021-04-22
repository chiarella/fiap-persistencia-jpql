package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

	@Id
	@Column(name = "id_consulta")
	@SequenceGenerator(name = "consulta", sequenceName = "sq_tb_consulta", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consulta")
	private int id;

	@Column(name = "dt_consulta")
	private Calendar dataCnsulta;

//	private Paciente paciente;
//
//	private Agendamento agendamento;
//
//	private Especialidade especialidade;

	public Consulta() {
		super();
	}

	public Consulta(int id, Calendar dataCnsulta, Paciente paciente, Agendamento agendamento,
			Especialidade especialidade) {
		super();
		this.id = id;
		this.dataCnsulta = dataCnsulta;
//		this.paciente = paciente;
//		this.agendamento = agendamento;
//		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataCnsulta() {
		return dataCnsulta;
	}

	public void setDataCnsulta(Calendar dataCnsulta) {
		this.dataCnsulta = dataCnsulta;
	}

//	public Paciente getPaciente() {
//		return paciente;
//	}
//
//	public void setPaciente(Paciente paciente) {
//		this.paciente = paciente;
//	}
//
//	public Agendamento getAgendamento() {
//		return agendamento;
//	}
//
//	public void setAgendamento(Agendamento agendamento) {
//		this.agendamento = agendamento;
//	}
//
//	public Especialidade getEspecialidade() {
//		return especialidade;
//	}
//
//	public void setEspecialidade(Especialidade especialidade) {
//		this.especialidade = especialidade;
//	}

}

