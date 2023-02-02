//149
public class func{
public void test_ConstructorLjava_io_InputStream(){
        InputStream is = new URL(jarName).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        assertNotNull("The jar input stream should have a manifest", jis.getManifest());
        JarEntry je = jis.getNextJarEntry();
        while (je != null) {
            if (je.getName().equals(A_CLASS)) {
                hasCorrectEntry = true;
            }
            je = jis.getNextJarEntry();
        }
}
}
