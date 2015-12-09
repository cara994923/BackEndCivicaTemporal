package com.proyectocivica.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.proyectocivica.bl.impl.CivicaBLImpl;
import com.proyectocivica.dao.CivicaDAO;
import com.proyectocivica.dto.Civica;
import com.proyectocivica.exception.MyException;

@Component
@Path("/get/civicas")
public class ServicioCivica {
	
	@Autowired	
	CivicaDAO civicaDAO;	
	
	@GET
	@Path("/{civica_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public Response getUser(@PathParam("civica_id") String civica_id) throws MyException {

		Civica civica = new Civica();
        civica = civicaDAO.leer(civica_id);
        return Response.ok() //200
				.entity(civica)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();

	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuarios(@PathParam("id") String id) throws MyException{
		List<Civica> civicas = new ArrayList<Civica>();
        civicas = civicaDAO.leerTodos();
		return Response.ok() //200
				.entity(civicas)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();
	}


}
