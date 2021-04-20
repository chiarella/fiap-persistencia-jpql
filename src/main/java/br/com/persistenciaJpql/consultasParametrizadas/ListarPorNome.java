package br.com.persistenciaJpql.consultasParametrizadas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.persistenciaJpql.dao.PacienteDAO;
import br.com.persistenciaJpql.entity.Paciente;

public class ListarPorNome {
	
	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("persistencia-jpql").createEntityManager();

		PacienteDAO dao = new PacienteDAO(em);

		List<Paciente> listar = dao.buscarPorNome("Anderson");
		
		System.out.println("");
		System.out.println("");

		for (Paciente paciente : listar) {

			
			System.out.println("ID: " + paciente.getId() + "  Paciente: " + paciente.getNome() 
			+ " CPF: " + paciente.getCpf());

		}
		
		em.close();
		
	}

}
