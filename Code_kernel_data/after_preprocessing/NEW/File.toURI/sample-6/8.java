//8
public class func{
public void getTestBundle(String baseName){
        File f = new File(m_testBundleBasePath, getBundleFilename(baseName));
        assertTrue("No such bundle: " + f, f.exists() && f.isFile());
        return f.toURI().toURL();
}
}
