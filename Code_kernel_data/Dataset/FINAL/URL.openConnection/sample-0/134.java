public class func{
public void testAnonymousAllowed(){
    setAuthenticationHandlerConfig(getAuthenticationHandlerConfiguration(true));
    start();
      URL url = new URL(getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
      stop();
}
}
