//117
public class func{
public void testEmptyAuthorityWithFragment(){
        URI uri = new URI("http://#fragment");
        assertEquals(null, uri.getAuthority());
        assertEquals("", uri.getPath());
        assertEquals("fragment", uri.getFragment());
}
}
