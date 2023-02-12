public class func{
public void testAnonymousAllowed(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
      auth.stop();
}
}
