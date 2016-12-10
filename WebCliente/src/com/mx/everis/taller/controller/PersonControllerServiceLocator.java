/**
 * PersonControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis.taller.controller;

public class PersonControllerServiceLocator extends org.apache.axis.client.Service implements com.mx.everis.taller.controller.PersonControllerService {

    public PersonControllerServiceLocator() {
    }


    public PersonControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonController
    private java.lang.String PersonController_address = "http://localhost:8081/Servicio/services/PersonController";

    public java.lang.String getPersonControllerAddress() {
        return PersonController_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonControllerWSDDServiceName = "PersonController";

    public java.lang.String getPersonControllerWSDDServiceName() {
        return PersonControllerWSDDServiceName;
    }

    public void setPersonControllerWSDDServiceName(java.lang.String name) {
        PersonControllerWSDDServiceName = name;
    }

    public com.mx.everis.taller.controller.PersonController getPersonController() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonController_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonController(endpoint);
    }

    public com.mx.everis.taller.controller.PersonController getPersonController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mx.everis.taller.controller.PersonControllerSoapBindingStub _stub = new com.mx.everis.taller.controller.PersonControllerSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonControllerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonControllerEndpointAddress(java.lang.String address) {
        PersonController_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mx.everis.taller.controller.PersonController.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mx.everis.taller.controller.PersonControllerSoapBindingStub _stub = new com.mx.everis.taller.controller.PersonControllerSoapBindingStub(new java.net.URL(PersonController_address), this);
                _stub.setPortName(getPersonControllerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PersonController".equals(inputPortName)) {
            return getPersonController();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.taller.everis.mx.com", "PersonControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.taller.everis.mx.com", "PersonController"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonController".equals(portName)) {
            setPersonControllerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
