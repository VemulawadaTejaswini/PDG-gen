//48
public class func{
	public void testEncodingParts(){
        URI uri = new URI("http", "user:pa55w?rd", "host", 80, "/doc|search",
                "q=green robots", "over 6\"");
        assertEquals("http", uri.getScheme());
        assertEquals("user:pa55w?rd@host:80", uri.getAuthority());
        assertEquals("user:pa55w%3Frd@host:80", uri.getRawAuthority());
        assertEquals("user:pa55w?rd", uri.getUserInfo());
        assertEquals("user:pa55w%3Frd", uri.getRawUserInfo());
        assertEquals("/doc|search", uri.getPath());
        assertEquals("/doc%7Csearch", uri.getRawPath());
        assertEquals("q=green robots", uri.getQuery());
        assertEquals("q=green%20robots", uri.getRawQuery());
        assertEquals("over 6\"", uri.getFragment());
        assertEquals("over%206%22", uri.getRawFragment());
        assertEquals("//user:pa55w?rd@host:80/doc|search?q=green robots",
                uri.getSchemeSpecificPart());
        assertEquals("//user:pa55w%3Frd@host:80/doc%7Csearch?q=green%20robots",
                uri.getRawSchemeSpecificPart());
        assertEquals("http://user:pa55w%3Frd@host:80/doc%7Csearch?q=green%20robots#over%206%22",
                uri.toString());
}
}
