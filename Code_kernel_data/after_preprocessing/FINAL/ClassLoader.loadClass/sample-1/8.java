public class func{
public void loadType(String fullName){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return loader != null ? loader.loadClass(fullName) : Class.forName(fullName);
}
}
