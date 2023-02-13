public class func{
public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_StringLjava_lang_StringLjava_lang_String(){
        URI uri = new URI("ht12-3+tp", "", "/p#a%E2%82%ACth", "q^u%25ery",
                "f/r\u00DFag");
        assertEquals("wrong scheme", "ht12-3+tp", uri.getScheme());
        assertNull("wrong authority", uri.getUserInfo());
        assertNull("wrong userinfo", uri.getUserInfo());
        assertNull("wrong hostname", uri.getHost());
        assertEquals("wrong port number", -1, uri.getPort());
        assertEquals("wrong path", "/p#a%E2%82%ACth", uri.getPath());
        assertEquals("wrong query", "q^u%25ery", uri.getQuery());
        assertEquals("wrong fragment", "f/r\u00DFag", uri.getFragment());
        assertEquals("wrong SchemeSpecificPart", "
                uri.getSchemeSpecificPart());
        assertEquals("wrong RawSchemeSpecificPart",
                "
                .getRawSchemeSpecificPart());
        assertEquals(
                "incorrect toString()",
                "ht12-3+tp:
                uri.toString());
        assertEquals("incorrect toASCIIString()",
                "ht12-3+tp:
                .toASCIIString());
}
}
