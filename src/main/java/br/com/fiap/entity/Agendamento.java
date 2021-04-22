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
@Table(name = "tb_agendamento")
public class Agendamento {

	@Id
	@Column(name = "id_agendamento")
	@SequenceGenerator(name = "agendamento", sequenceName = "sq_tb_agendamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agendamento")
	private int id;

	@Column(name="dt_agendamento")
	private Calendar dataAgendamento;

//	@Column(name="paciente")
//	private Paciente paciente;

	@Column(name="dt_consulta")
	private Calendar dataConsultaPrevista;

//	@Column(name="especialidade")
//	private Especialidade especialidade;

	public Agendamento() {
		super();
	}

	public Agendamento(int id, Calendar dataAgendamento, Paciente paciente, Calendar dataConsultaPrevista,
			Especialidade especialidade) {
		super();
		this.id = id;
		this.dataAgendamento = dataAgendamento;
//		this.paciente = paciente;
		this.dataConsultaPrevista = dataConsultaPrevista;
//		this.especialidade = especialidade;
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

//	public Paciente getPaciente() {
//		return paciente;
//	}
//
//	public void setPaciente(Paciente paciente) {
//		this.paciente = paciente;
//	}

	public Calendar getDataConsultaPrevista() {
		return dataConsultaPrevista;
	}

	public void setDataConsultaPrevista(Calendar dataConsultaPrevista) {
		this.dataConsultaPrevista = dataConsultaPrevista;
	}

//	public Especialidade getEspecialidade() {
//		return especialidade;
//	}
//
//	public void setEspecialidade(Especialidade especialidade) {
//		this.especialidade = especialidade;
//	}

}

