//125
public class func{
	public void testNotAuthenticated(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      Assert.assertTrue(conn.getHeaderField(KerberosAuthenticator.WWW_AUTHENTICATE) != null);
      auth.stop();
}
}
