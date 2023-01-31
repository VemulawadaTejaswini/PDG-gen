//26
public class func{
	public void addPathToClassLoader(File path,URLClassLoader classLoader){
      URL u = path.toURI().toURL();
      addUrlMethod.invoke(classLoader, u);
}
}
