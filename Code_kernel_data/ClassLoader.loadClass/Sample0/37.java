//36
public class func{
	public void classIsVisible(ClassLoader classLoader,Class klass){
            return classLoader.loadClass(klass.getName()) == klass;
}
}
