//38
public class func{
	public void createLargeCacheFromNetwork(String type,String name,String url,ProgressCallback callback){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("GET");
    conn.setConnectTimeout(5000);
    createCacheFromStream(type, name, conn.getInputStream(), conn.getContentLength(), callback);
    conn.disconnect();
}
}
