package com.mx.everis.taller.controller;

import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) {
		PersonController pc=new PersonControllerProxy();
		try {
			pc.addPersons("s", "s", "s");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
