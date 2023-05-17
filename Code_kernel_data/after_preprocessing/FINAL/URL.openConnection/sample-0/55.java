public class func{
public void testServletTestCase(){
        URL url = new URL(getServletURL() + "bla");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.connect();
        assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
            new BufferedReader(new InputStreamReader(conn.getInputStream()));
        assertEquals("ping", reader.readLine());
        assertEquals(null, reader.readLine());
}
}
