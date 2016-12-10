package com.mx.everis.taller.controller;

public class PersonControllerProxy implements com.mx.everis.taller.controller.PersonController {
  private String _endpoint = null;
  private com.mx.everis.taller.controller.PersonController personController = null;
  
  public PersonControllerProxy() {
    _initPersonControllerProxy();
  }
  
  public PersonControllerProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonControllerProxy();
  }
  
  private void _initPersonControllerProxy() {
    try {
      personController = (new com.mx.everis.taller.controller.PersonControllerServiceLocator()).getPersonController();
      if (personController != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personController)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personController != null)
      ((javax.xml.rpc.Stub)personController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mx.everis.taller.controller.PersonController getPersonController() {
    if (personController == null)
      _initPersonControllerProxy();
    return personController;
  }
  
  public void actPerson(java.lang.String nombre, java.lang.String apellidos, java.lang.String logros, int id) throws java.rmi.RemoteException{
    if (personController == null)
      _initPersonControllerProxy();
    personController.actPerson(nombre, apellidos, logros, id);
  }
  
  public void addPersons(java.lang.String nombre, java.lang.String apellidos, java.lang.String logros) throws java.rmi.RemoteException{
    if (personController == null)
      _initPersonControllerProxy();
    personController.addPersons(nombre, apellidos, logros);
  }
  
  public void removePerson(int id) throws java.rmi.RemoteException{
    if (personController == null)
      _initPersonControllerProxy();
    personController.removePerson(id);
  }
  
  public java.lang.String pruebaServidor() throws java.rmi.RemoteException{
    if (personController == null)
      _initPersonControllerProxy();
    return personController.pruebaServidor();
  }
  
  
}