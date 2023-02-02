//159
public class func{
	public void findClass(String clazz){
        ClassLoader loader = new InVivoClassLoader(clazz, context);
        return loader.loadClass(clazz);
}
}
