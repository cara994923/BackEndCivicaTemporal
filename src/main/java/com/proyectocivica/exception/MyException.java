package com.proyectocivica.exception;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}	

}
