//45
public class func{
	public void findInSystemBundle(String entry){
        ClassLoader loader = BundleActivator.class.getClassLoader();
        return loader == null ? ClassLoader.getSystemResource(entry) : loader.getResource(entry);
}
}
