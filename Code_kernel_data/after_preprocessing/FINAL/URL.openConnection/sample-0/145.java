public class func{
public void testPathParam(){
    assertNotNull(url);
    URL url = new URL(AbstractResponseViewNoRedirectActionTestCase.url);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    assertEquals("bar_value", bar);
}
}
