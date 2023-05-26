public class func{
public void testEmptyAuthorityWithFragment(){
        URI uri = new URI("http:
        assertEquals(null, uri.getAuthority());
        assertEquals("", uri.getPath());
        assertEquals("fragment", uri.getFragment());
}
}
