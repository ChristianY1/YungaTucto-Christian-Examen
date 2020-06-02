package ec.edu.ups.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity

public class Autor implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String nacionalidad;
	@OneToOne
	@JoinColumn
	private Capitulo capitulo;
	

	public Autor() {
		
	}


	public Autor(String nombre, String nacionalidad, Capitulo capitulo) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.capitulo = capitulo;
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


	public Capitulo getCapitulo() {
		return capitulo;
	}


	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}


//	@Override
//	public String toString() {
//		return "Autor [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", capitulo="
//				+ capitulo + "]";
//	}
//   
}
