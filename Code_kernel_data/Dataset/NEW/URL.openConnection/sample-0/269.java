//269
public class func{
public void openUrlConnection(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setUseCaches(false);
        conn.setChunkedStreamingMode(0);
        conn.setRequestProperty("connection", "close");    // Disable keep-alive because of issues with it
}
}
