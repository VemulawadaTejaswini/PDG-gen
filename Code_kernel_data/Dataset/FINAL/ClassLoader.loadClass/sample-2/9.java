public class func{
public void forName(final String className){
            final ClassLoader loader = Thread.currentThread().getContextClassLoader();
            return loader.loadClass(className);
            OpenEJBErrorHandler.classNotFound(systemLocation, className);
}
}
