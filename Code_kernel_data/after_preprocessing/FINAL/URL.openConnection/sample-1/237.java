public class func{
public void test_getJarFileURL(){
        URL url = new URL("jar:file:
        String jarFileUrl = ((JarURLConnection) url.openConnection()).getJarFileURL().toString();
        assertTrue(jarFileUrl.equals("file:
}
}
