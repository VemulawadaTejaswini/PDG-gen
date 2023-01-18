//13
public class func{
	public void isJetty(){
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
         classLoader.loadClass("org.jboss.arquillian.container.jetty.embedded_7.JettyEmbeddedContainer");
}
}
