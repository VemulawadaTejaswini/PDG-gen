public class func{
public void makeConnection(String contextPath){
    URL url = new URL(contextPath);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setConnectTimeout(CONNECTION_TIMEOUT);
    conn.connect();
}
}
