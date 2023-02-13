public class func{
public void testOpenSslConnection_https(){
        final URL httpsUrl = new URL("https:
        final HttpsURLConnection connection = (HttpsURLConnection) httpsUrl.openConnection();
        client.openSslConnection(connection);
        assertEquals(sslSocketFactory, connection.getSSLSocketFactory());
}
}
