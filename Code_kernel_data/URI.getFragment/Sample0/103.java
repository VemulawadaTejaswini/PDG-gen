//102
public class func{
	public void testSetQueryParams(){
        initialUri = new URI("http://un:ps@server.com:9876/p1/p2?z=3,y=4#fragment");
        final URI updatedUri = URIUtils.setQueryParams(initialUri, params);
        assertFalse(updatedUri.toString().contains("a #"));
        assertFalse(updatedUri.toString().contains("1#t"));
        assertFalse(updatedUri.toString().contains(" &time"));
        assertFalse(updatedUri.toString().contains("#trick"));
        assertEquals("http", updatedUri.getScheme());
        assertEquals("fragment", updatedUri.getFragment());
        assertEquals("server.com", updatedUri.getHost());
        assertEquals("/p1/p2", updatedUri.getPath());
        assertEquals(9876, updatedUri.getPort());
}
}
