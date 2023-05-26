public class func{
public void setUp(){
    proxyTestClass = (Class<ProxyTest>) testClassLoader.loadClass(ProxyTest.class.getName());
}
}
