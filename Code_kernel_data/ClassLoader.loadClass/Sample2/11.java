//10
public class func{
	public void getCommand(String className){
        final ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return cl.loadClass(className).newInstance();
}
}
