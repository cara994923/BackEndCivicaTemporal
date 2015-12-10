package com.proyectocivica.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.proyectocivica.dao.UsuarioDAO;
import com.proyectocivica.dto.Civica;
import com.proyectocivica.dto.Usuario;
import com.proyectocivica.exception.MyException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springcfg.xml")
@Transactional
public class UsuarioDAOImplIntegrationTest {
	
	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Test
	public void testLeerTodos() throws MyException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios=usuarioDAO.leerTodos();
		
		assertTrue(usuarios.size()>0);
		
	}
	
	@Test
	public void testLeer() throws MyException{
		
		Usuario usuario=usuarioDAO.leer(1216713880L);
		
		assertNotNull(usuario);
		
	}
}
