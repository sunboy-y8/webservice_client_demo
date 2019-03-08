# webservice_client_demo
### webservice客户端创建
##### idea初始化创建webservice client
> New -> Project... -> Java -> 选中 WebServices Client -> Version 勾选 Apache Axis -> 点击 Next 生成项目.

> 打开创建的项目，只需要填写一个 Web service wsdl url 即可.

> 默认下，打开example包下的类，如下

```
package example;

import mypackage.TestServiceLocator;
import mypackage.Test_PortType;

public class HelloWorldClient {
  public static void main(String[] argv) {

      System.out.println("---开始请求远程服务器---");

      try {
          TestServiceLocator locator = new TestServiceLocator();

          Test_PortType service = locator.getTest(); // 获取远程服务器的 Test 类

          String s = service.test(); // 获取 Test 类中的 test 方法

          System.out.println(s); // 打印远程服务器的返回值

          System.out.println("---请求结束---");

      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
```
