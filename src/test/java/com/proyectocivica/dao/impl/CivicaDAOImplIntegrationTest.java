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

import com.proyectocivica.dao.CivicaDAO;
import com.proyectocivica.dto.Civica;
import com.proyectocivica.exception.MyException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springcfg.xml")
@Transactional
public class CivicaDAOImplIntegrationTest {

	@Autowired
	CivicaDAO civicaDAO;
	
	
	@Test
	public void testLeerTodos() throws MyException {
		
		List<Civica> civicas = new ArrayList<Civica>();
		civicas=civicaDAO.leerTodos();
		
		assertTrue(civicas.size()>0);
		
	}
	
	@Test
	public void testLeer() throws MyException{
		
		Civica civica=civicaDAO.leer("9c198774");
		
		assertNotNull(civica);
		
	}
	

}
