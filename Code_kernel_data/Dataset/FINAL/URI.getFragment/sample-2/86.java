public class func{
public void testRelativeFragmentOnQuery(){
        URI base = new URI("http:
        URI uri = base.resolve("#another");
        assertEquals("http:
        assertEquals("/file", uri.getPath());
        assertEquals("query/x", uri.getQuery());
        assertEquals("another", uri.getFragment());
}
}
