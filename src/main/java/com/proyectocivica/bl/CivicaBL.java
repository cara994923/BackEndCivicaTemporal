package com.proyectocivica.bl;

import com.proyectocivica.exception.MyException;

public interface CivicaBL {
	
	public boolean validar(String identificador) throws MyException;

}
