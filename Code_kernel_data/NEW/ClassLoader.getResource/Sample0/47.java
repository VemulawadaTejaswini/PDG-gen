//46
public class func{
	public void getResourceAsURL(final String resource){
    ClassLoader classLoader = getClassLoaderForResource(resource);
    return classLoader != null ? classLoader.getResource(resource) : null;
}
}
