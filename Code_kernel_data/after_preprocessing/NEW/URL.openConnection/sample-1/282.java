//282
public class func{
public void test_getManifest(){
        is = new URL(jarName).openConnection().getInputStream();
        jis = new JarInputStream(is);
        m = jis.getManifest();
        assertNotNull("The jar input stream should have a manifest", m);
}
}
