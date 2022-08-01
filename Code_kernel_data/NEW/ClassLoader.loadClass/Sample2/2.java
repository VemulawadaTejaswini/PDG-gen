//1
public class func{
	public void getObject(){
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            return classLoader.loadClass(className);
            throw new NamingException("Erorr loading class: " + className);
}
}
