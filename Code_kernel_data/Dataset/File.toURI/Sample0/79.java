//78
public class func{
	public void testLoadFromJarFile(){
    ClassLoader tempLoader = new URLClassLoader(new URL[]{new File("src/test/resources/SpyDotPropertiesTest.jar").toURI().toURL()}, currentThreadLoader);
}
}
