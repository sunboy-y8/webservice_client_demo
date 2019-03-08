package example;

import mypackage.TestServiceLocator;
import mypackage.Test_PortType;

import javax.management.remote.rmi.RMIConnection;

public class HelloWorldClient {
  public static void main(String[] argv) {

    System.out.println("--开始请求--");
    try {
      TestServiceLocator locator = new TestServiceLocator();
      Test_PortType service = locator.getTest();
      // If authorization is required
      //((TestSoapBindingStub)service).setUsername("user3");
      //((TestSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      String s = service.test();
      System.out.println("请求结果为："+s);
      System.out.println("--请求结束--");
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
