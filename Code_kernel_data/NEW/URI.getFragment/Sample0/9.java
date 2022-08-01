//8
public class func{
	public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_String(){
        URI uri = new URI("mailto", "mduerst@ifi.unizh.ch", null);
        assertNull("wrong userinfo", uri.getUserInfo());
        assertNull("wrong hostname", uri.getHost());
        assertNull("wrong authority", uri.getAuthority());
        assertEquals("wrong port number", -1, uri.getPort());
        assertNull("wrong path", uri.getPath());
        assertNull("wrong query", uri.getQuery());
        assertNull("wrong fragment", uri.getFragment());
        assertEquals("wrong SchemeSpecificPart", "mduerst@ifi.unizh.ch", uri
                .getSchemeSpecificPart());
            uri = new URI("mailto", null, null);
            uri = new URI("3scheme", "//authority/path", "fragment");
            uri = new URI("", "//authority/path", "fragment");
}
}
