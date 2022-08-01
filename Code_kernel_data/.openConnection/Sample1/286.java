//285
public class func{
	public void test_getManifest(){
        InputStream is = new URL(jarName2).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        m = jis.getManifest();
        assertNull("The jar input stream should not have a manifest", m);
}
}
