//238
public class func{
	public void testException(){
    HttpURLConnection c2 = (HttpURLConnection)new URL("http://localhost:" + PORT + "/error").openConnection();
    assertEquals(c2.getResponseCode(), RestStatus.INTERNAL_SERVER_ERROR);
}
}
