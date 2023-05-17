public class func{
public void getImplementationNamed(String className,Class<T> pluginClass){
        final ClassLoader classLoader = implementationToClassLoader.get(className);
        if (classLoader == null) {
            throw new ClassNotFoundException("Couldn't find a class loader for " + className);
        }
        return classLoader.loadClass(className).asSubclass(pluginClass);
}
}
