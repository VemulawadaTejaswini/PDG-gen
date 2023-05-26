public class func{
public void test_getManifest(){
        assertEquals(new HashSet<String>(Arrays.asList("plus.bmp", "swt.dll")),
                attr.keySet());
        URL invURL = createContent("InvalidJar.jar", "Test.class");
        JarURLConnection juConn = (JarURLConnection) invURL.openConnection();
            juConn.getManifest();
}
}
