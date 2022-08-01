//403
public class func{
	public void testQueryRedirect(){
        URL url = new URI("http",null,"localhost",HTTP_SERVER_PORT,"/path","redirect=/a/b/c/d?q",null).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        assertEquals(302, conn.getResponseCode());
        assertEquals("Temporary Redirect", conn.getResponseMessage());
        assertEquals("/a/b/c/d?q",conn.getHeaderField("Location"));
}
}
