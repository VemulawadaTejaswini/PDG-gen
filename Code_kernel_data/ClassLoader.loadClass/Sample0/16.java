//15
public class func{
	public void loadClass(ClassLoader classLoader,String className){
            testClass = classLoader.loadClass( className );
            throw new RuntimeException( "Unable to create test class '" + className + "'", e );
}
}
