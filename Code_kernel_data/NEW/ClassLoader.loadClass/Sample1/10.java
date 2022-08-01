//9
public class func{
	public void getClass(String name){
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            return classLoader != null ? classLoader.loadClass( name ) : null;
}
}
