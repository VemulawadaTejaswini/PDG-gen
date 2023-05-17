public class func{
public void testOpenSslConnection_nullSslSocketFactory(){
        final URL httpsUrl = new URL("https:
        final HttpsURLConnection connection = (HttpsURLConnection) httpsUrl.openConnection();
        client.openSslConnection(connection);
}
}
