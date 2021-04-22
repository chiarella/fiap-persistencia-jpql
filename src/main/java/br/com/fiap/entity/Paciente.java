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
@Table(name = "tb_paciente")
public class Paciente {

	@Id
	@Column(name = "id_paciente")
	@SequenceGenerator(name = "paciente", sequenceName = "sq_tb_paciente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente")
	private int id;

	@Column(name = "nome_paciente", nullable = false, length = 80)
	private String nome;

	@Column(name = "cpf_paciente")
	private String cpf;

	@Column(name = "email_paciente")
	private String email;

	@Column(name = "dt_paciente")
	private Calendar dataNasc;

	@Column(name = "genero_paciente")
	private String genero;

	public Paciente() {
		super();
	}

	public Paciente(int id, String nome, String cpf, String email, Calendar dataNasc, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
