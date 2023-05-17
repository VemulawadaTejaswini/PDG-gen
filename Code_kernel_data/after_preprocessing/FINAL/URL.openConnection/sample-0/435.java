public class func{
public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(500, conn.getResponseCode());
}
}
