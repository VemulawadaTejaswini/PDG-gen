//157
public class func{
	public void testNoCacheHeader(){
    URL url = new URL(baseUrl, "/echo?a=b&c=d");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    assertEquals("no-cache", conn.getHeaderField("Cache-Control"));
    assertEquals("no-cache", conn.getHeaderField("Pragma"));
    assertNotNull(conn.getHeaderField("Expires"));
    assertNotNull(conn.getHeaderField("Date"));
    assertEquals(conn.getHeaderField("Expires"), conn.getHeaderField("Date"));
}
}
