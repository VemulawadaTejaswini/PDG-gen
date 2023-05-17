//49
public class func{
public void getResource(String name){
    final URL url = cl != null ? cl.getResource(resolveName(name)): null;
    return url != null ? url: ClassLocator.class.getResource(name);
}
}
