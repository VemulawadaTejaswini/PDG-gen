//18
public class func{
	public void load(Class<T> baseClazz,String clazzName){
            loader = Thread.currentThread().getContextClassLoader();
            return (Class<T>) loader.loadClass(clazzName);
}
}
