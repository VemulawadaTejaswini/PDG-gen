//100
public class func{
	public void getClassBy(String className){
      ClassLoader loader = JwbfException.class.getClassLoader();
      return loader.loadClass(className);
}
}
