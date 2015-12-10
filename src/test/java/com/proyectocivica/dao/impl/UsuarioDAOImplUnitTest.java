package com.proyectocivica.dao.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import com.proyectocivica.dto.Usuario;
import com.proyectocivica.exception.MyException;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioDAOImplUnitTest {
	
	private static final Long CEDULA = 1234567890L;
	private static final String NOMBRE = "Usuario Prueba";
	
	private Usuario usuarioDTO;	
		
	@Mock
	private UsuarioDAOImpl usuarioDAOImpl;
	
	@Before
	public void preparar() throws MyException {
		usuarioDTO=new Usuario();
		usuarioDTO.setCedula(CEDULA);
		usuarioDTO.setNombre(NOMBRE);
		
		
		List<Usuario> usuarios=new ArrayList<Usuario>();
		usuarios.add(usuarioDTO);
		when(usuarioDAOImpl.leerTodos()).thenReturn(usuarios);
		when(usuarioDAOImpl.leer(CEDULA)).thenReturn(usuarioDTO);
	}
	
	
	@Test
	public void testLeerTodosListaNoVacia() throws MyException {
		
		List<Usuario> usuarios=usuarioDAOImpl.leerTodos();	
		
		assertTrue(usuarios.size()>0);
		
	}
	
	@Test
	public void testLeerTodosNoNulo() throws MyException {
		
		List<Usuario> usuarios = usuarioDAOImpl.leerTodos();
		
		assertNotNull(usuarios);	
			
	}
	
	@Test
	public void testLeerNoNulo() throws MyException {
		
		Usuario uDTO = usuarioDAOImpl.leer(CEDULA);
		
		assertNotNull(uDTO);
		
	}	
		
		
	@Test
	public void testLeerNombreEsperado() throws MyException {
		
		Usuario uDTO = usuarioDAOImpl.leer(CEDULA);
		
		 
	        assertEquals(uDTO.getNombre(), NOMBRE);      
		
			
	}
	
	@Test
	public void testLeerCedulaEsperada() throws MyException {
		
		Usuario uDTO = usuarioDAOImpl.leer(CEDULA);
		
		 
	        assertEquals(uDTO.getCedula(),CEDULA);	       	
			
	}	


}
