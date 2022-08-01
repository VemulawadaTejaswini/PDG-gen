//215
public class func{
	public void testOpenSslConnection_nullSslSocketFactory(){
        final URL httpsUrl = new URL("https://example.com");
        final HttpsURLConnection connection = (HttpsURLConnection) httpsUrl.openConnection();
        client.openSslConnection(connection);
}
}
