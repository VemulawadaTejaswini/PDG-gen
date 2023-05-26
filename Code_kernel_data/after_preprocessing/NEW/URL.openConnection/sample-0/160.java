//160
public class func{
public void testNotAuthenticated(){
    setAuthenticationHandlerConfig(getAuthenticationHandlerConfiguration());
    start();
      URL url = new URL(getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      assertTrue(conn.getHeaderField(KerberosAuthenticator.WWW_AUTHENTICATE) != null);
      stop();
}
}
