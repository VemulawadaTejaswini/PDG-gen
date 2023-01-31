//42
public class func{
	public void testExtractURIComponents(){
    expected.put(prefix + "scheme", uri.getScheme());
    expected.put(prefix + "authority", uri.getAuthority());
    expected.put(prefix + "path", uri.getPath());
    expected.put(prefix + "query", uri.getQuery());
    expected.put(prefix + "fragment", uri.getFragment());
    expected.put(prefix + "host", uri.getHost());
    expected.put(prefix + "port", uri.getPort());
    expected.put(prefix + "schemeSpecificPart", uri.getSchemeSpecificPart());
    expected.put(prefix + "userInfo", uri.getUserInfo());
    processAndVerifySuccess(record, expected);
    record = new Record();
    record.put("uri", "invalidURI:");
    processAndVerifyFailure(record);
}
}
