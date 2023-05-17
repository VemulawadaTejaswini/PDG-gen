public class func{
public void findUrl(String name){
    ClassLoader classLoader = getClass().getClassLoader();
    return classLoader.getResource(name);
}
}
