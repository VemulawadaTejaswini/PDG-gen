public class func{
public void testSleep(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-Sleep", "1000");
        conn.connect();
}
}
