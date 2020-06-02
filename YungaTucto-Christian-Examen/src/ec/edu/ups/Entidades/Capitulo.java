package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String nacionalidad;
	@ManyToOne
	@JoinColumn
	private Libro libro;
	

	public Capitulo() {
		
	}


	public Capitulo(String nombre, String nacionalidad, Libro libro) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libro = libro;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "Capitulo [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", libro="
				+ libro + "]";
	}
	
   
}
