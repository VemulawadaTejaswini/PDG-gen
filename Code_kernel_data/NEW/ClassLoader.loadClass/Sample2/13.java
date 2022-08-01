//12
public class func{
	public void isTomcat(){
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
         classLoader.loadClass("org.jboss.arquillian.container.tomcat.managed_7.TomcatManagedContainer");
}
}
