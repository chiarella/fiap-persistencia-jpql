package br.com.persistenciaJpql.dao;

import javax.persistence.EntityManager;

import br.com.persistenciaJpql.entity.Especialidade;

public class EspecialidadeDAO extends GenericDAO<Especialidade, Integer> {

	public EspecialidadeDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
}
