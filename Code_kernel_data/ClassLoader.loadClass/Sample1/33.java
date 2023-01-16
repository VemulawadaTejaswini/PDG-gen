//32
public class func{
	public void loadClass(String className,ClassLoader loader){
        if (loader == null) {
            return ClassLoaderUtils.loadClass(className, getClass());
        } else {
            return loader.loadClass(className);
        }
}
}
