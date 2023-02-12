public class func{
public void createConnection(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setUseCaches(true);
        conn.setRequestProperty("Accept-Encoding", acceptEncoding);
        conn.setReadTimeout(timeout);
        conn.setConnectTimeout(timeout);
}
}
