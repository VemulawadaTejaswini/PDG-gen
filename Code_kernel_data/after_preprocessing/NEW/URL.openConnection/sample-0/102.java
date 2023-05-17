//102
public class func{
public void testHeaders(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-SetHeaders", "Location: /abcd|X-Dummy: none");
        conn.connect();
        assertEquals(200, conn.getResponseCode());
        assertEquals("OK", conn.getResponseMessage());
        assertEquals("/abcd",conn.getHeaderField("Location"));
        assertEquals("none",conn.getHeaderField("X-Dummy"));
}
}
