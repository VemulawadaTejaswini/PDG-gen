public class func{
public void testColonInFragment(){
        URI uri = new URI("http:
        assertEquals("/file", uri.getPath());
        assertEquals(-1, uri.getPort());
        assertEquals("fragment:80", uri.getFragment());
}
}
