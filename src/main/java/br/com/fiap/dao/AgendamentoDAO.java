package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Agendamento;

public class AgendamentoDAO extends GenericDAO<Agendamento, Integer> {

	public AgendamentoDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}
