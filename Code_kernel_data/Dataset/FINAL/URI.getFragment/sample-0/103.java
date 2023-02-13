public class func{
public void testRelativePathOnQuery(){
        URI base = new URI("http:
        URI uri = base.resolve("another");
        assertEquals("http:
        assertEquals("/another", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals(null, uri.getFragment());
}
}
