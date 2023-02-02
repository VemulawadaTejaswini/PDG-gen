//8
public class func{
public void connect(URL aUrl){
        HttpsURLConnection connection = (HttpsURLConnection) aUrl.openConnection();
        connection.setSSLSocketFactory(sslSocketFactory);
}
}
