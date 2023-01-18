//409
public class func{
	public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    assertEquals("bar_value", bar);
}
}
