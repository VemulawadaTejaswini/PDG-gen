//111
public class func{
	public void testGetAll(){
        URL url = new URL("http://localhost:" + PORT + "/test/services/rest2/myRestService");
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "text/plain");
        InputStream in = connect.getInputStream();
        assertEquals("0", getStringFromInputStream(in));
}
}
