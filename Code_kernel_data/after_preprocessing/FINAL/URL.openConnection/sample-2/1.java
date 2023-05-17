public class func{
public void test_getEntryName(){
        URL u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect entryName", "plus.bmp", juc
                .getEntryName());
        u = copyAndOpenResourceStream("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect entryName", juc.getEntryName());
        URL url = copyAndOpenResourceStream("lf.jar", "foo.jar!/Bugs/HelloWorld.class");
        assertEquals("foo.jar!/Bugs/HelloWorld.class", ((JarURLConnection) url.openConnection()).getEntryName());
}
}
