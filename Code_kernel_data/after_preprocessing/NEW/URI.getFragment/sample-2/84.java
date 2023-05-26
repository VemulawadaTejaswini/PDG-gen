//84
public class func{
public void testFragmentOnly(){
        URI uri = new URI("http://host#fragment");
        assertEquals("host", uri.getHost());
        assertEquals("", uri.getPath());
        assertEquals(null, uri.getQuery());
        assertEquals("fragment", uri.getFragment());
}
}
