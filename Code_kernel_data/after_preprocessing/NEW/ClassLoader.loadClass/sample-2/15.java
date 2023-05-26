//15
public class func{
public void register(String name){
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      Class oClass = classLoader.loadClass(name);
      Debug.logVerbose("[JdonFramework]register: name=" + name + " class=" + oClass.getName(), module);
      register(name, oClass);
      registryDirectory.addComponentName(oClass, name);
      Debug.logWarning(" registe error: " + name + " should be a full class's name", module);
}
}
