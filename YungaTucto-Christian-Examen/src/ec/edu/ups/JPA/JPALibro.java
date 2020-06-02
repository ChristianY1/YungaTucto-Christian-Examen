package ec.edu.ups.JPA;

import ec.edu.ups.DAO.LibroDAO;
import ec.edu.ups.Entidades.Libro;

public class JPALibro extends JPAGenericDAO<Libro, Integer> implements LibroDAO {

	public JPALibro(Class<Libro> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

}
