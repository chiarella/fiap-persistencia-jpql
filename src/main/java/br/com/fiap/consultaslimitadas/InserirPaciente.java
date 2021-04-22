package br.com.fiap.consultaslimitadas;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.PacienteDAO;
import br.com.fiap.entity.Paciente;

public class InserirPaciente {
	
	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("persistencia-jpql")
				.createEntityManager();
		PacienteDAO pacienteDao = new PacienteDAO(em);
		
//		Paciente entidade1 = new Paciente(0, "Anderson", "320.320.320.32","teste@gmail.com", null, null);
//		pacienteDao.cadastrar(entidade1);
		
		Paciente entidade1 = new Paciente(0, "Anderson", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade1);
		
		Paciente entidade2 = new Paciente(0, "Aline", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Feminino");
		pacienteDao.cadastrar(entidade2);
		
		Paciente entidade3 = new Paciente(0, "Marcia", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Feminino");
		pacienteDao.cadastrar(entidade3);
		
		Paciente entidade4 = new Paciente(0, "Angelo", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade4);
		
		Paciente entidade5 = new Paciente(0, "Daniel", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade5);
		
		Paciente entidade6 = new Paciente(0, "Jose", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade6);
		
		Paciente entidade7 = new Paciente(0, "Joao", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade7);
		
		Paciente entidade8 = new Paciente(0, "Caio", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade8);

		Paciente entidade9 = new Paciente(0, "Bruno", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
		pacienteDao.cadastrar(entidade9);
		
		Paciente entidade10 = new Paciente(0, "Francisco", "320.320.320.32","teste@gmail.com", Calendar.getInstance(), "Masculino");
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
