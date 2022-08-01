//433
public class func{
	public void testStatus(){
    URL url = applicationURL("/status");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    assertEquals("Juzu/1.0.0", headers.get("X-Powered-By"));
}
}
