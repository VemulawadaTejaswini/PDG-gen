public class func{
public void testPing(){
    final URL url = new URL("http://"+ SERVER_HOST + ":" + webServerPort + "/ping");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    String response = IOUtils.toString(conn.getInputStream());
    Assert.assertEquals("pong\n", response);
}
}
