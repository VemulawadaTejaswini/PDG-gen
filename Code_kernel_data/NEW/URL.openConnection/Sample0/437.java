//436
public class func{
	public void run(){
        final URL url = mockWebServer.getUrl(path);
          conn = (HttpURLConnection) url.openConnection();
          responseCode.set(conn.getResponseCode()); // Force the connection to hit the "server".
}
}
