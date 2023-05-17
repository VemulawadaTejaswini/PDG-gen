//4
public class func{
public void NginxGroovyHandlerFactory(){
    ClassLoader parent = Thread.currentThread().getContextClassLoader();
      groovyLoader = (ClassLoader) parent.loadClass("groovy.lang.GroovyClassLoader").getConstructor(ClassLoader.class).newInstance(parent);
}
}
