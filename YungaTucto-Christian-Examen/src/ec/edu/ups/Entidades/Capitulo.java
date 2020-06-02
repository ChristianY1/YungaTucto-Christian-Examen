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
	private String titulo;
	@ManyToOne
	@JoinColumn
	private Libro libro;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "capitulo")
	private Autor autor;
	

	public Capitulo() {
		
	}


	public Capitulo(String nombre, String titulo, Libro libro) {
		super();
		this.nombre = nombre;
		this.titulo = titulo;
		this.libro = libro;
		this.autor = autor;
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


//	@Override
//	public String toString() {
//		return "Capitulo [codigo=" + codigo + ", nombre=" + nombre + ", titulo=" + titulo + ", libro=" + libro
//				+ ", autor=" + autor + "]";
//	}


	


	
   
}
