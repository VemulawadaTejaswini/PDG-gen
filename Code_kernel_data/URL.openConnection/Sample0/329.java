//328
public class func{
	public void testOpenSslConnection_http(){
        final URL httpUrl = new URL("http://example.com");
        final HttpURLConnection connection = (HttpURLConnection) httpUrl.openConnection();
        client.openSslConnection(connection);
        assertFalse(connection instanceof HttpsURLConnection);
}
}
