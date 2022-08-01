//9
public class func{
	public void getResolver(String className){
            ClassLoader cl = Configuration.class.getClassLoader();
            DependencyResolver resolver = (DependencyResolver) cl.loadClass(className).newInstance();
}
}
