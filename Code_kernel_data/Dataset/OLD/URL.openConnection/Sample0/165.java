//164
public class func{
	public void testResponseLength(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-ResponseLength", "10");
        conn.connect();
        final InputStream inputStream = conn.getInputStream();
        assertEquals(10, IOUtils.toByteArray(inputStream).length);
        inputStream.close();
}
}
