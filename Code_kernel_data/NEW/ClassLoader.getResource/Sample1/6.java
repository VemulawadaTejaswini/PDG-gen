//5
public class func{
	public void classpathResourceExistsForLocation(String location){
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader.getResource(location) != null;
}
}
