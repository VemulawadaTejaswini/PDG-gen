public class func{
public void isClassPresent(String name){
         ClassLoader classLoader = getThreadContextClassLoader();
         classLoader.loadClass(name); 
}
}
