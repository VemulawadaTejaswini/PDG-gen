//30
public class func{
public void test_getJarEntry(){
        URL u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect JarEntry", "plus.bmp", juc
                .getJarEntry().getName());
        u = copyAndOpenResourceStream("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect JarEntry", juc.getJarEntry());
}
}
