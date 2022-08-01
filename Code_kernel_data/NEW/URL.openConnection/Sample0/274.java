//273
public class func{
	public void createConnection(String url,Object extra){
    String encodedUrl = Uri.encode(url, ALLOWED_URI_CHARS);
    HttpURLConnection conn = (HttpURLConnection) new URL(encodedUrl).openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
}
}
