public class func{
public void loadClass(ClassLoader loader,String className){
      if (loader.getClass() == MLet.class) return ((MLet)loader).loadClass(className, null);
      return loader.loadClass(className);
}
}
