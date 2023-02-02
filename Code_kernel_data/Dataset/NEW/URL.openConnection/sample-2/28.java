//28
public class func{
public void test_getEntryName(){
        URL u = createContent("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect entryName", "plus.bmp", juc
                .getEntryName());
        u = createContent("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect entryName", juc.getEntryName());
}
}
