//9
public class func{
public void testUriParts(){
        URI uri = new URI("http://username:password@host:8080/directory/file?query#ref");
        assertEquals("http", uri.getScheme());
        assertEquals("username:password@host:8080", uri.getAuthority());
        assertEquals("username:password@host:8080", uri.getRawAuthority());
        assertEquals("username:password", uri.getUserInfo());
        assertEquals("username:password", uri.getRawUserInfo());
        assertEquals("host", uri.getHost());
        assertEquals(8080, uri.getPort());
        assertEquals("/directory/file", uri.getPath());
        assertEquals("/directory/file", uri.getRawPath());
        assertEquals("query", uri.getQuery());
        assertEquals("query", uri.getRawQuery());
        assertEquals("ref", uri.getFragment());
        assertEquals("ref", uri.getRawFragment());
        assertEquals("//username:password@host:8080/directory/file?query",
                uri.getSchemeSpecificPart());
        assertEquals("//username:password@host:8080/directory/file?query",
                uri.getRawSchemeSpecificPart());
}
}
