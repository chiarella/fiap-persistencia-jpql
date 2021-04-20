package br.com.persistenciaJpql.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {

	
	private int id;

	private Calendar dataAgendamento;

	private Paciente paciente;

	private Calendar dataConsultaPrevista;

	private Especialidade especialidade;

	public Agendamento() {
		super();
	}

	public Agendamento(int id, Calendar dataAgendamento, Paciente paciente, Calendar dataConsultaPrevista,
			Especialidade especialidade) {
		super();
		this.id = id;
		this.dataAgendamento = dataAgendamento;
		this.paciente = paciente;
		this.dataConsultaPrevista = dataConsultaPrevista;
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Calendar dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getDataConsultaPrevista() {
		return dataConsultaPrevista;
	}

	public void setDataConsultaPrevista(Calendar dataConsultaPrevista) {
		this.dataConsultaPrevista = dataConsultaPrevista;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
