//98
public class func{
public void getServerLoader(final ClassLoader loader){
            return loader.loadClass("org.apache.catalina.Container").getClassLoader();
}
}
