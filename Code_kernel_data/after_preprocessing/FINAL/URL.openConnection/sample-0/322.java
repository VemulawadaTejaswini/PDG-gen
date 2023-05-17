public class func{
public void setupHTTPConnection(String url){
    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection(Proxy.NO_PROXY);
}
}
