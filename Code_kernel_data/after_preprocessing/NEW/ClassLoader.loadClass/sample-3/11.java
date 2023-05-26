//11
public class func{
public void newInstance(String className,ClassLoader classLoader){
            Class<?> clazz = classLoader.loadClass(className);
            return (T) clazz.newInstance();
}
}
