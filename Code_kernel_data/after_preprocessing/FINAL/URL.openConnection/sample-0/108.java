public class func{
public void testSuccess(){
    HttpURLConnection c = (HttpURLConnection)new URL("http:
    assertEquals(c.getResponseCode(), RestStatus.OK);
    InputStream in = c.getInputStream();
}
}
