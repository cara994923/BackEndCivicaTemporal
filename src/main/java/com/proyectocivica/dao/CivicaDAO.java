package com.proyectocivica.dao;

import java.util.List;

import com.proyectocivica.dto.Civica;
import com.proyectocivica.exception.MyException;



public interface CivicaDAO {
	
	public List<Civica> leerTodos() throws MyException;
	public Civica leer(String identificador) throws MyException;
	public void crear(Civica civica) throws MyException;
	public void actualizar(Civica civica) throws MyException;
	public void borrar(Civica civica) throws MyException;

}
