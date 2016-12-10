package com.mx.everis.taller.controller;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mx.everis.taller.dao.PersonaDao;
import com.mx.everis.taller.model.Persona;


@WebService
public class PersonController {

	private PersonaDao pr=new PersonaDao();
	@WebMethod
	public void addPersons(String nombre,String apellidos,String logros)
	{
      pr.addPerson(nombre,apellidos,logros);
	}
	
	@WebMethod
	public void actPerson(String nombre,String apellidos,String logros,int id)
	{
      pr.updatePerson(nombre,apellidos,logros,id);
	}
	
	@WebMethod
	public void removePerson(int id)
	{
      pr.deletePerson(id);
	}
	
	
	
	@WebMethod
	public String pruebaServidor()
	{
          return "Hola esta jalando";
	}
	
}
