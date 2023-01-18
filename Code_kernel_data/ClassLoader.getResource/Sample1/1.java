//0
public class func{
	public void toFile(String name){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return new File(cl.getResource(name).toURI());
}
}
