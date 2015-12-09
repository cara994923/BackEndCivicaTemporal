package com.proyectocivica.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class Civica implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String identificador;
	private Integer saldo;
	private Usuario usuario;
	
	
	@XmlElement(required=true)	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@XmlElement(required=true)
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	@XmlElement(required=true)
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	
}
