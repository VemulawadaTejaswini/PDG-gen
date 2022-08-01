//13
public class func{
	public void testExtractURIComponent(){
    URI uri = new URI(uriStr);
    testExtractURIComponent2(uriStr, "scheme", uri.getScheme());
    testExtractURIComponent2(uriStr, "authority", uri.getAuthority());
    testExtractURIComponent2(uriStr, "path", uri.getPath());
    testExtractURIComponent2(uriStr, "query", uri.getQuery());
    testExtractURIComponent2(uriStr, "fragment", uri.getFragment());
    testExtractURIComponent2(uriStr, "host", uri.getHost());
    testExtractURIComponent2(uriStr, "port", uri.getPort());
    testExtractURIComponent2(uriStr, "schemeSpecificPart", uri.getSchemeSpecificPart());
    testExtractURIComponent2(uriStr, "userInfo", uri.getUserInfo());
      testExtractURIComponent2(uriStr, "illegalType", uri.getUserInfo());
      fail();
    testExtractURIComponent2("invalidURI:", "host", uri.getHost(), false);
}
}
