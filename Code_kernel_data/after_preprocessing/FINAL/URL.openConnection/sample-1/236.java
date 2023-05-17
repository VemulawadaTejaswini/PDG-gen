public class func{
public void test_getNextJarEntry(){
        InputStream is = new URL(jarName).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        JarEntry je = jis.getNextJarEntry();
        while (je != null) {
            actual.add(je.toString());
            je = jis.getNextJarEntry();
        }
}
}
