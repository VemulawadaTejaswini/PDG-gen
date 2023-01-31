//1
public class func{
	public void getCustomizeInstance(final String className){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = ClassLoader.getSystemClassLoader();
        }
        Class<?> c = loader.loadClass(className);
        return c.newInstance();
}
}
