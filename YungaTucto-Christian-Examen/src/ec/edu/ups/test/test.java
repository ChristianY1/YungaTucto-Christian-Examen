package ec.edu.ups.test;

import ec.edu.ups.DAO.AutorDAO;
import ec.edu.ups.DAO.CapituloDAO;
import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.LibroDAO;
import ec.edu.ups.Entidades.Autor;
import ec.edu.ups.Entidades.Capitulo;
import ec.edu.ups.Entidades.Libro;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroDAO lib = DAOFactory.getDaoFactory().getLibroDAO();
		
		CapituloDAO cap = DAOFactory.getDaoFactory().getcapCapituloDAO();
		AutorDAO au = DAOFactory.getDaoFactory().getauAutorDAO();
		
		Libro l = new Libro("el principito", "647236", 701);
		
		Capitulo c = new Capitulo("ALGO", "NUEVO viaje", l);
		
		Autor a  = new Autor("antuan", "frances", c);
		
		l.addCapitulos(c);
		a.setCapitulo(c);
		lib.create(l);
		au.create(a);
		
		
		
		

	}

}
