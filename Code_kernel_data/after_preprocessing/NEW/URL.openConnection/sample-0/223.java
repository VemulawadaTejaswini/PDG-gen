//223
public class func{
public void createUrlConnection(String urlAsStr,int timeout){
        URL url = new URL(urlAsStr);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
        hConn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        hConn.setConnectTimeout(timeout);
        hConn.setReadTimeout(timeout);
}
}
