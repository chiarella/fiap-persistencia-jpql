package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Paciente;


public class PacienteDAO extends GenericDAO<Paciente, Integer> {

	public PacienteDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	// CONSULTAS LIMITADAS

	// Listando e Ordenado por nome
	public List<Paciente> listarPorNome() {
		return em.createQuery("from Paciente p order by nome", Paciente.class).getResultList();
	}

	// Listando Ordenando por nome e Decrescente
	public List<Paciente> listarPorNomeDecrescente() {
		return em.createQuery("from Paciente p order by nome desc", Paciente.class).getResultList();
	}

	// Listando paginado LMITANDO A 5 registros
	public List<Paciente> listarPorNomePaginado() {
		return em.createQuery("from Paciente p order by nome", Paciente.class)
				.setMaxResults(5).getResultList();

	}

	// Listando paginado LMITANDO A 5 registros
	public List<Paciente> listarPorNomePaginadoCustomizado(int inicio, int fim) {
		return em.createQuery("from Paciente p order by nome", Paciente.class)
				.setFirstResult(inicio)
				.setMaxResults(fim)
				.getResultList();

	}
	
	// CONSULTAS PARAMETRIZADAS
	
	//Retorna Nomes ou Sobrenomes utilizando "LIKE"
	public List<Paciente> buscarPorNome(String nome) {
		return em.createQuery("from Paciente p where p.nome like :nomePaciente ", Paciente.class)
				.setParameter("nomePaciente", "%" + nome  + "%")
				.getResultList();
	}
	
}