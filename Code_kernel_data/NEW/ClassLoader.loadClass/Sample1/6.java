//5
public class func{
	public void getValidator(String validator){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        if (cl == null) {
            cl = ConfigureCxfSecurity.class.getClassLoader();
        }
        return cl.loadClass(validator).newInstance();
}
}
