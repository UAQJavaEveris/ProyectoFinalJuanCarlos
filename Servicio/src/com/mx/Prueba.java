package com.mx;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Prueba {
  
	@WebMethod
	public String getValor()
	{
		return "hola";
	}
	@WebMethod
	public String getValores(int a,int b)
	{
		return "hoa de get valores"+a+b;
	}
}