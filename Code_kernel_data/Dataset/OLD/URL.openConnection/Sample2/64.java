//63
public class func{
	public void testHeader_BoundaryCheck(){
        URL url = createTempFileWithContent(RESOURCE_NAME);
        URLConnection urlConnection = url.openConnection();
        assertNull(urlConnection.getHeaderField(Integer.MIN_VALUE));
        assertNull(urlConnection.getHeaderField(Integer.MAX_VALUE));
        assertNull(urlConnection.getHeaderFieldKey(Integer.MIN_VALUE));
        assertNull(urlConnection.getHeaderFieldKey(Integer.MAX_VALUE));
        assertNull(urlConnection.getHeaderField(null));
}
}
