public class func{
public void testPingUsingHttpURLConnection(){
    final URL url = new URL("http://"+ SERVER_HOST + ":" + webServerPort + "/ping");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
    String errorMessage = IOUtils.toString(conn.getErrorStream());
    Assert.assertTrue(errorMessage.contains("Authentication required"));
}
}
