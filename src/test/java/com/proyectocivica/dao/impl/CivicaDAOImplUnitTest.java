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


import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SpringConfigurationFile.xml")
@Transactional
public class CivicaDAOImplTest {
	
	@Autowired
	CivicaDAO civicaDAO;
	@Test
	public void testLeerTodos() throws MyException {
		List<Civica> lista=null;
		try{
			
			lista=civicaDAO.leerTodos();
			Assert.assertTrue(lista.size()>0);
			
		}catch(Exception e){
			
			e.printStackTrace();
			fail(e.getMessage());
			
		}
	}

}


