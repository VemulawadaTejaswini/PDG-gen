//62
public class func{
	public void checkMyFacesContextFactory(){
    ClassLoader classLoader = JsfUtils.class.getClassLoader();
      Class<?> clazz = classLoader.loadClass("org.apache.myfaces.context.FacesContextFactoryImpl");
}
}
