//116
public class func{
	public void testColonInFragment(){
        URI uri = new URI("http://host/file#fragment:80");
        assertEquals("/file", uri.getPath());
        assertEquals(-1, uri.getPort());
        assertEquals("fragment:80", uri.getFragment());
}
}
