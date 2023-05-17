//17
public class func{
public void canLoadClass(ClassLoader loader,String className){
    if (loader == null) {
      loader = ClassLoader.getSystemClassLoader();
    }
      loader.loadClass(className);
}
}
