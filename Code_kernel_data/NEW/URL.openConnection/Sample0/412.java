//411
public class func{
	public void testQueryStatus(){
        URL url = new URI("http",null,"localhost",HTTP_SERVER_PORT,"/path","status=303 See Other",null).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        assertEquals(303, conn.getResponseCode());
        assertEquals("See Other", conn.getResponseMessage());
}
}
