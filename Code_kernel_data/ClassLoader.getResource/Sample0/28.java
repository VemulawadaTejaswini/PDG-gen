//27
public class func{
	public void resourceURL(String name){
        ClassLoader tcl = Thread.currentThread().getContextClassLoader();
        URL url = tcl.getResource(name);
        return url != null ? url.toString() : null;
}
}
