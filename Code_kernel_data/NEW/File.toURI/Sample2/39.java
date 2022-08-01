//38
public class func{
	public void addResource(URLClassLoader classLoader,File file){
      addURL.invoke(classLoader, new Object[] { file.toURI().toURL() });
}
}
