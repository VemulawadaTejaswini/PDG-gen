//14
public class func{
public void loadClass(ClassLoader loader,String className){
        if (loader == null || osgiVersion >= OSGI_1_5 && !checkValidLoader(loader)) {
            throw new ClassNotFoundException(className);
        }
        return loader.loadClass(className);
}
}
