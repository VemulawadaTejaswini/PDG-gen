//166
public class func{
	public void testAnonymousDisallowed(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      Assert.assertTrue(conn.getHeaderFields().containsKey("WWW-Authenticate"));
      Assert.assertEquals("Authentication required", conn.getResponseMessage());
      auth.stop();
}
}
