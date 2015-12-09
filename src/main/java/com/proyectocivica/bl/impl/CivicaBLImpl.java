package com.proyectocivica.bl.impl;

import com.proyectocivica.bl.CivicaBL;
import com.proyectocivica.dao.CivicaDAO;
import com.proyectocivica.dto.Civica;
import com.proyectocivica.exception.MyException;

public class CivicaBLImpl implements CivicaBL {
	
	private CivicaDAO civicaDAO;

	public boolean validar(String identificador) throws MyException {
		// TODO Auto-generated method stub
		
		
		Civica civicaDTO;
		
			if(identificador==null || identificador.isEmpty()){
				throw new MyException("Identificador NO Valido", null);
			}
			
			civicaDTO = civicaDAO.leer(identificador);
			if(civicaDTO == null) {
				
				return false;
			}
			

		return true;
		
	}

	public CivicaDAO getCivicaDAO() {
		return civicaDAO;
	}

	public void setCivicaDAO(CivicaDAO civicaDAO) {
		this.civicaDAO = civicaDAO;
	}	

}
