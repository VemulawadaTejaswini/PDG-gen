//16
public class func{
	public void testLoader(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url2 = loader.getResource(defaultConfigFileName1);
}
}
