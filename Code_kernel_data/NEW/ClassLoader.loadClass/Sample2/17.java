//16
public class func{
	public void getDAO(String jndiDAOName){
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      object = classLoader.loadClass(className).newInstance();
}
}
