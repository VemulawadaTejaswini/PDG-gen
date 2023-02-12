public class func{
public void getResolver(String className){
                ClassLoader cl = Configuration.class.getClassLoader();
                return (DependencyResolver) cl.loadClass(className).newInstance();
}
}
