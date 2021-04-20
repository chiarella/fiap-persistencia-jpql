package br.com.persistenciaJpql.dao;

import javax.persistence.EntityManager;

import br.com.persistenciaJpql.entity.Agendamento;

public class AgendamentoDAO extends GenericDAO<Agendamento, Integer> {

	public AgendamentoDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}
