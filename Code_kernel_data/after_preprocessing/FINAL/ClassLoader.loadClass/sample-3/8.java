public class func{
public void newInstance(final String className,final ClassLoader classLoader){
        Class<?> clazz = classLoader.loadClass(className);
        return newInstance(clazz.newInstance(), clazz);
}
}
