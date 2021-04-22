package br.com.fiap.consultaslimitadas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.PacienteDAO;
import br.com.fiap.entity.Paciente;

public class ListarPacienteOrdenadoJPQL {
	
	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("persistencia-jpql").createEntityManager();

		PacienteDAO dao = new PacienteDAO(em);

		List<Paciente> listar = dao.listarPorNome();
		
		System.out.println("");
		System.out.println("");

		for (Paciente paciente : listar) {

			
			System.out.println("ID: " + paciente.getId() + "  Paciente: " + paciente.getNome() 
			+ " CPF: " + paciente.getCpf());

		}
		
		em.close();
		
	}

}
