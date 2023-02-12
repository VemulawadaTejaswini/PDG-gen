public class func{
public void testWith(String expected,Charset charset){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    String contentType = headers.get("Content-Type");
    assertNotNull(contentType);
}
}
