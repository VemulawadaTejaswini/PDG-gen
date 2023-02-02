//200
public class func{
public void getResourceLength(String path){
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(12 * 1000);
        conn.setRequestMethod("GET");
        return conn.getContentLength();
}
}
