//108
public class func{
	public void testSuccess(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/foobar").openConnection();
    assertEquals(c.getResponseCode(), RestStatus.OK);
    InputStream in = c.getInputStream();
}
}
