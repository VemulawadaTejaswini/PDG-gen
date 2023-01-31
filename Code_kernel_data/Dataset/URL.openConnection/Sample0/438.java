//437
public class func{
	public void simpleDispatch(){
    mockWebServer.setDispatcher(dispatcher);
    final URL url = mockWebServer.getUrl("/");
    final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.getResponseCode(); // Force the connection to hit the "server".
}
}
