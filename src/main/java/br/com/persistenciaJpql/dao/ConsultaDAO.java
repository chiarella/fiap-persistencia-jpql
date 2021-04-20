package br.com.persistenciaJpql.dao;

import javax.persistence.EntityManager;

import br.com.persistenciaJpql.entity.Consulta;

public class ConsultaDAO extends GenericDAO<Consulta, Integer> {

	public ConsultaDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
}
