//39
public class func{
public void createCacheFromNetwork(String type,String name,String url,ProgressCallback callback){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("GET");
    conn.setConnectTimeout(5000);
    byte[] buf = readInputStream(conn.getInputStream(), conn.getContentLength(), callback);
    createCache(type, name, buf);
    conn.disconnect();
}
}
