//14
public class func{
public void createClass(String className){
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      classService = classLoader.loadClass(className);
}
}
