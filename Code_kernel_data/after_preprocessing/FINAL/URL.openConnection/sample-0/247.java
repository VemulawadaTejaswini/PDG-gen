public class func{
public void testCookieEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
    c.setRequestProperty(HttpConstants.REQUEST_COOKIE_HEADER_NAME, cookie);
    assertEquals(c.getHeaderField(HttpConstants.RESPONSE_COOKIE_HEADER_NAME), cookie);
}
}
