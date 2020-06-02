package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numPaginas;
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "libro")
	private Set<Capitulo> telefonos = new HashSet<Capitulo>();
	
	public Libro() {
	
	}
	
   
}
