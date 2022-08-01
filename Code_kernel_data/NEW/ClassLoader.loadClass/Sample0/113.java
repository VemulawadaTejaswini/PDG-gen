//112
public class func{
	public void testJavaCoreNotOnClassPath(){
      ClassLoader classLoader = org.eclipse.xtext.xbase.XbaseRuntimeModule.class.getClassLoader();
      classLoader.loadClass("org.eclipse.jdt.core.JavaCore");
}
}
