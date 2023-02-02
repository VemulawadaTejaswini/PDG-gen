//121
public class func{
	public void testGetBook123(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/xml");
        InputStream in = connect.getInputStream();
        assertNotNull(in);           
        InputStream expected = getClass()
            .getResourceAsStream("resources/expected_get_book123.txt");
}
}
