/**
 * PersonController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis.taller.controller;

public interface PersonController extends java.rmi.Remote {
    public void actPerson(java.lang.String nombre, java.lang.String apellidos, java.lang.String logros, int id) throws java.rmi.RemoteException;
    public void addPersons(java.lang.String nombre, java.lang.String apellidos, java.lang.String logros) throws java.rmi.RemoteException;
    public void removePerson(int id) throws java.rmi.RemoteException;
    public java.lang.String pruebaServidor() throws java.rmi.RemoteException;
}
