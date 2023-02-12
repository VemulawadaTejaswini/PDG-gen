public class func{
public void test_getEntryName(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        assertEquals("foo.jar!/Bugs/HelloWorld.class",((JarURLConnection)url.openConnection()).getEntryName());
}
}
