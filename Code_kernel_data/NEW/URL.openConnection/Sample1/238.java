//237
public class func{
	public void test_getJarFileURL(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        String jarFileUrl = ((JarURLConnection) url.openConnection()).getJarFileURL().toString();
        assertTrue(jarFileUrl.equals("file:///ba
}
}
