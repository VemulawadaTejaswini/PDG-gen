//103
public class func{
	public void isClassPresent(String className){
      ClassLoader classLoader = SampleApplication.class.getClassLoader();
      classLoader.loadClass(className);
}
}
