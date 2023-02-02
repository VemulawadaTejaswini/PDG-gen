//2
public class func{
public void test_getManifest(){
        URL u = createContent("lf.jar", "swt.dll");
        juc = (JarURLConnection) u.openConnection();
        Manifest manifest = juc.getManifest();
        Map<String, Attributes> attr = manifest.getEntries();
                attr.keySet());
}
}
