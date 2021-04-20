package br.com.persistenciaJpql.consultasLimitadas;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.persistenciaJpql.dao.PacienteDAO;
import br.com.persistenciaJpql.entity.Paciente;

public class InserirPaciente {
	
	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("persistencia-jpql")
				.createEntityManager();
		PacienteDAO pacienteDao = new PacienteDAO(em);
		
		Paciente entidade1 = new Paciente(0, "Anderson", "320.320.320.32");
		pacienteDao.cadastrar(entidade1);
		
		Paciente entidade2 = new Paciente(0, "Aline", "320.320.320.32");
		pacienteDao.cadastrar(entidade2);
		
		Paciente entidade3 = new Paciente(0, "Marcia", "320.320.320.32");
		pacienteDao.cadastrar(entidade3);
		
		Paciente entidade4 = new Paciente(0, "Angelo", "320.320.320.32");
		pacienteDao.cadastrar(entidade4);
		
		Paciente entidade5 = new Paciente(0, "Daniel", "320.320.320.32");
		pacienteDao.cadastrar(entidade5);
		
		Paciente entidade6 = new Paciente(0, "Jose", "320.320.320.32");
		pacienteDao.cadastrar(entidade6);
		
		Paciente entidade7 = new Paciente(0, "Joao", "320.320.320.32");
		pacienteDao.cadastrar(entidade7);
		
		Paciente entidade8 = new Paciente(0, "Caio", "320.320.320.32");
		pacienteDao.cadastrar(entidade8);

		Paciente entidade9 = new Paciente(0, "Bruno", "320.320.320.32");
		pacienteDao.cadastrar(entidade9);
		
		Paciente entidade10 = new Paciente(0, "Francisco", "320.320.320.32");
		pacienteDao.cadastrar(entidade10);

		try {
			pacienteDao.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		em.close();
		
		
	}

}
