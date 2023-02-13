public class func{
public void testFragmentOnly(){
        URI uri = new URI("http:
        assertEquals("host", uri.getHost());
        assertEquals("", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment", uri.getFragment());
}
}
