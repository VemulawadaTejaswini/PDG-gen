public class func{
public void connectTo(String url){
    String encodedUrl = Uri.encode(url, ALLOWED_URI_CHARS);
    HttpURLConnection conn = (HttpURLConnection) new URL(encodedUrl).openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
    conn.connect();
}
}
