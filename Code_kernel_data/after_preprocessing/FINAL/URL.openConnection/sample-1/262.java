public class func{
public void test_getEntryName(){
        URL url = new URL("jar:file:
        assertEquals("foo.jar!/Bugs/HelloWorld.class",((JarURLConnection)url.openConnection()).getEntryName());
}
}
