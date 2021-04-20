package br.com.persistenciaJpql.consultasLimitadas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.persistenciaJpql.dao.PacienteDAO;
import br.com.persistenciaJpql.entity.Paciente;

public class ListarPacientePaginadoCincoCustomizado {
	
	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("persistencia-jpql").createEntityManager();

		PacienteDAO dao = new PacienteDAO(em);

		//Começa a busca pelo sexto registro
		List<Paciente> listar = dao.listarPorNomePaginadoCustomizado(6,3);

		System.out.println("");
		System.out.println("");
		

		for (Paciente paciente : listar) {

			System.out.println(
					"ID: " + paciente.getId() + "  Paciente: " + paciente.getNome() + " CPF: " + paciente.getCpf());

		}

		em.close();

	}

}
