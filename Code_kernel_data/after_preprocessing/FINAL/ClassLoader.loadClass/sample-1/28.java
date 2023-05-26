public class func{
public void loadClass(ClassLoader classLoader,String classname){
            if (classLoader == null || classname == null) {
                return null;
            }
                return classLoader.loadClass(classname);
}
}
