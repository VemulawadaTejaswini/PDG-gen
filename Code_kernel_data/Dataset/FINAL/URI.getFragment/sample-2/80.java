public class func{
public void test_ConstructorLjava_lang_StringLjava_lang_StringLjava_lang_StringILjava_lang_StringLjava_lang_StringLjava_lang_String(){
            uri = new URI("http", "us:e@r", "hostname", 85, "/file/dir#/qu?e/",
                    "qu?er#y", "frag#me?nt");
            assertEquals("wrong userinfo", "us:e@r", uri.getUserInfo());
            assertEquals("wrong hostname", "hostname", uri.getHost());
            assertEquals("wrong port number", 85, uri.getPort());
            assertEquals("wrong path", "/file/dir#/qu?e/", uri.getPath());
            assertEquals("wrong query", "qu?er#y", uri.getQuery());
            assertEquals("wrong fragment", "frag#me?nt", uri.getFragment());
            assertEquals("wrong SchemeSpecificPart",
                    "
                    .getSchemeSpecificPart());
            fail("Unexpected Exception: " + e);
}
}
