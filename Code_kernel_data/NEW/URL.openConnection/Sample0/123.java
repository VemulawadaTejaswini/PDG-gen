//122
public class func{
	public void testStatus(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-ResponseStatus", "302 Temporary Redirect");
        conn.connect();
        assertEquals(302, conn.getResponseCode());
        assertEquals("Temporary Redirect", conn.getResponseMessage());
}
}
