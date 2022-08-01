//67
public class func{
	public void isGroovyAvailable(){
    ClassLoader classLoader = Loader.getClassLoaderOfClass(EnvUtil.class);
      Class<?> bindingClass = classLoader.loadClass("groovy.lang.Binding");
}
}
