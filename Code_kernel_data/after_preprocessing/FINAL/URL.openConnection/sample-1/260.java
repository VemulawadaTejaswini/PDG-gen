public class func{
public void test_getJarFileURL(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        assertEquals("file:///bar.jar", ((JarURLConnection) url.openConnection()).getJarFileURL().toString());
}
}
