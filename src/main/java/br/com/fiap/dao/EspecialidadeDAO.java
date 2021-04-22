package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Especialidade;

public class EspecialidadeDAO extends GenericDAO<Especialidade, Integer> {

	public EspecialidadeDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
}
