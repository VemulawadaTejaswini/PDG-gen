public class func{
public void testException(){
    HttpURLConnection c2 = (HttpURLConnection)new URL("http:
    assertEquals(c2.getResponseCode(), RestStatus.INTERNAL_SERVER_ERROR);
}
}
