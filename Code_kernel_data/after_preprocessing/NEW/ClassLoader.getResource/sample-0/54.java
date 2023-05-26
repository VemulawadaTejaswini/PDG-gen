//54
public class func{
public void getResource(String resourceName){
  String path = resourcePath(resourceName);
  ClassLoader cl = getClassLoader();
  return cl != null ? cl.getResource(path) :
          ClassLoader.getSystemResource(path);
}
}
