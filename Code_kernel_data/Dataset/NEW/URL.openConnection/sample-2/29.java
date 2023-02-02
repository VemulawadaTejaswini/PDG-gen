//29
public class func{
public void test_getMainAttributes(){
        URL u = createContent("lf.jar", "swt.dll");
        juc = (JarURLConnection) u.openConnection();
        java.util.jar.Attributes a = juc.getMainAttributes();
        assertEquals("Returned incorrect Attributes", "1.0", a
                .get(java.util.jar.Attributes.Name.MANIFEST_VERSION));
        URL invURL = createContent("InvalidJar.jar", "Test.class");
        JarURLConnection juConn = (JarURLConnection) invURL.openConnection();
            juConn.getMainAttributes();
}
}
