package com.proyectocivica.dao;

import java.util.List;

import com.proyectocivica.dto.Usuario;
import com.proyectocivica.exception.MyException;

public interface UsuarioDAO {
	
	public List<Usuario> leerTodos() throws MyException;
	public Usuario leer(Long cedula) throws MyException;
	public void crear(Usuario usuario) throws MyException;
	public void actualizar(Usuario usuario) throws MyException;
	public void borrar(Usuario usuario) throws MyException;
	
}
