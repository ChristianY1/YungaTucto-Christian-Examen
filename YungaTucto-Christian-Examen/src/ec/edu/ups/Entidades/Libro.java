package ec.edu.ups.Entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

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
	private Set<Capitulo> capitulos = new HashSet<Capitulo>();
	
	public Libro() {
	
	}

	public Libro(String nombre, String iSBN, int numPaginas) {
		
		this.nombre = nombre;
		this.ISBN = iSBN;
		this.numPaginas = numPaginas;
		this.capitulos = capitulos;
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Set<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Set<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	
	public void addCapitulos(Capitulo capitulo) {
		this.capitulos.add(capitulo);
	}
	
	public void removeTelefono(Capitulo capitulo) {
		this.capitulos.remove(capitulo);
	}
	
	
//	@Override
//	public String toString() {
//		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numPaginas=" + numPaginas
//				+ ", capitulos=" + capitulos + "]";
//	}
	
	
	
	
   
}
