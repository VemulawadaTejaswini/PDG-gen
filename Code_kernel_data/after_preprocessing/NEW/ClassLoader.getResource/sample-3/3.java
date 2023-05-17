//3
public class func{
public void run(){
                    ClassLoader clazzLoader = clazz.getClassLoader();
                    url = clazzLoader.getResource(resourceName);
                    if (url == null) {
                        clazzLoader = Thread.currentThread().getContextClassLoader();
                        url = clazzLoader.getResource(resourceName);
                    }
}
}
