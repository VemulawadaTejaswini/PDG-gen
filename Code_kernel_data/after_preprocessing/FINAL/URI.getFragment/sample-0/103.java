public class func{
public void testRelativePathOnQuery(){
        URI base = new URI("http://host/file?query/x");
        URI uri = base.resolve("another");
        assertEquals("http://host/another", uri.toString());
        assertEquals("/another", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals(null, uri.getFragment());
}
}
