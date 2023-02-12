public class func{
public void testGetResponseCodeNoResponseBody(){
        server.enqueue(new MockResponse()
                .addHeader("abc: def"));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoInput(false);
        assertEquals("def", conn.getHeaderField("abc"));
        assertEquals(200, conn.getResponseCode());
            conn.getInputStream();
}
}
