//0
public class func{
public void loadCoyotePackage(ClassLoader loader){
        Class<?> clazz = loader.loadClass(basePackage + "Constants");
        clazz.newInstance();
}
}
