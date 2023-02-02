//6
public class func{
public void loadClass(String className){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            return Class.forName(className);
        } else {
            return classLoader.loadClass(className);
        }
}
}
