package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Consulta;

public class ConsultaDAO extends GenericDAO<Consulta, Integer> {

	public ConsultaDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
}
