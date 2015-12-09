package com.proyectocivica.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cedula;
	private String nombre;	

	@XmlElement(required=true)
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	@XmlElement(required=true)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
