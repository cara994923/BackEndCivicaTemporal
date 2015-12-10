package com.proyectocivica.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;


import com.proyectocivica.dto.Civica;
import com.proyectocivica.dto.Usuario;
import com.proyectocivica.exception.MyException;



@RunWith(MockitoJUnitRunner.class)
public class CivicaDAOImplUnitTest {
	
	private static final String IDENTIFICADOR = "63bb2609";
	private static final Integer SALDO = 1000;
	private static final Long CEDULA = 1234567890L;
	private static final String NOMBRE = "Usuario Prueba";
	
	
	private Civica civicaDTO;	
	private Usuario usuarioDTO;
	
	
	@Mock	
	private CivicaDAOImpl civicaDAOImpl;
	
	@Before
	public void preparar() throws MyException {
		usuarioDTO=new Usuario();
		usuarioDTO.setCedula(CEDULA);
		usuarioDTO.setNombre(NOMBRE);
		civicaDTO=new Civica();
		civicaDTO.setIdentificador(IDENTIFICADOR);
		civicaDTO.setSaldo(SALDO);
		civicaDTO.setUsuario(usuarioDTO);
		
		List<Civica> civicas=new ArrayList<Civica>();
		civicas.add(civicaDTO);
		when(civicaDAOImpl.leerTodos()).thenReturn(civicas);
		when(civicaDAOImpl.leer(IDENTIFICADOR)).thenReturn(civicaDTO);
	}
	
	@Test
	public void testLeerTodosNoNulo() throws MyException {
		
		List<Civica> civicas = civicaDAOImpl.leerTodos();
		
		assertNotNull(civicas);	
			
	}
	
	@Test
	public void testLeerTodosListaNoVacia() throws MyException {
		
		List<Civica> civicas = civicaDAOImpl.leerTodos();
		
		assertTrue(civicas.size()>0);
			
	}
	
	@Test
	public void testLeerTodosValorAlmacenadoEsperado() throws MyException {
		
		List<Civica> civicas = civicaDAOImpl.leerTodos();
		
		assertEquals(NOMBRE, civicas.get(0).getUsuario().getNombre());
			
	}
	
	@Test
	public void testLeerNoNulo() throws MyException {
		
		Civica cDTO = civicaDAOImpl.leer(IDENTIFICADOR);
		
		 assertNotNull(cDTO);	        
		
			
	}
	
	@Test
	public void testLeerSaldoEsperado() throws MyException {
		
		Civica cDTO = civicaDAOImpl.leer(IDENTIFICADOR);
		
		 
	        assertEquals(cDTO.getSaldo(), SALDO);      
		
			
	}
	
	@Test
	public void testLeerUsuarioNombreEsperado() throws MyException {
		
		Civica cDTO = civicaDAOImpl.leer(IDENTIFICADOR);
		
		 
	        assertEquals(cDTO.getUsuario().getNombre(), NOMBRE);
	       	
			
	}
	
	@Test
	public void testLeerUsuarioCedulaEsperada() throws MyException {
		
		Civica cDTO = civicaDAOImpl.leer(IDENTIFICADOR);
		
		 
	        assertEquals(cDTO.getUsuario().getCedula(), CEDULA);          
		
			
	}
	
	
}




