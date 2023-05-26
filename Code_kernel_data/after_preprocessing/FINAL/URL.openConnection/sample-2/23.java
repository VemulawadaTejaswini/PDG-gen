public class func{
public void connect(URL targetURL){
    URLConnection connection = httpProxy == null ? targetURL.openConnection() : targetURL.openConnection(httpProxy);
    return (HttpURLConnection) connection;
}
}
