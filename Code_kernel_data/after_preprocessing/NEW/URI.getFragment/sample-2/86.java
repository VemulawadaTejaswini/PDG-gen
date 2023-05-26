//86
public class func{
public void testRelativeFragmentOnQuery(){
        URI base = new URI("http://host/file?query/x#fragment");
        URI uri = base.resolve("#another");
        assertEquals("http://host/file?query/x#another", uri.toString());
        assertEquals("/file", uri.getPath());
        assertEquals("query/x", uri.getQuery());
        assertEquals("another", uri.getFragment());
}
}
