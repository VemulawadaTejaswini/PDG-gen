//76
public class func{
	public void isPresent(final String className,final ClassLoader classLoader){
      return classLoader.loadClass(className) != null;
}
}
