public class func{
public void httpGet(WebServer webServer,SSLSocketFactory socketFactory){
    URL url = new URL("https:
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.setSSLSocketFactory(socketFactory);
    conn.setRequestMethod("GET");
    conn.getResponseCode();
}
}
