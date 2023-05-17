public class func{
public void setUp(){
    realClass = (Class<ProxyTestImpl>) testClassLoader.loadClass(ProxyTestImpl.class.getName());
}
}
