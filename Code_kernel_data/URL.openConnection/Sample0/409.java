//408
public class func{
	public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(302, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    String redirect = headers.get("Location");
    driver.get(redirect);
}
}
