//209
public class func{
	public void testGetBookNotExistent(){
        URL url = new URL(endpointAddress);
        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
        connect.addRequestProperty("Accept", "application/xml");
        assertEquals(405, connect.getResponseCode());
        InputStream in = connect.getErrorStream();
        assertNotNull(in);           
        assertEquals("Exception is not mapped correctly", 
                     "StringTextWriter - Nonexistent method",
                     getStringFromInputStream(in).trim());
}
}
