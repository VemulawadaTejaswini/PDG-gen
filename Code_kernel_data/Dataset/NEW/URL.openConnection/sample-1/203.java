//203
public class func{
public void testSslConnection(){
    URL url = new URL(sslServerAddress.getUrl() + "/first/");
    URLConnection connection = url.openConnection();
    HttpsURLConnection sslConnection = (HttpsURLConnection) connection;
}
}
