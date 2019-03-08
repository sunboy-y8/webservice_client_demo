/**
 * TestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface TestService extends javax.xml.rpc.Service {
    public java.lang.String getTestAddress();

    public mypackage.Test_PortType getTest() throws javax.xml.rpc.ServiceException;

    public mypackage.Test_PortType getTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
