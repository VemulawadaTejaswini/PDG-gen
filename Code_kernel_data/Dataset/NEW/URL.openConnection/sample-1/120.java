//120
public class func{
public void testGetBook123(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/json");
        InputStream in = connect.getInputStream();
        assertNotNull(in);           
        assertEquals("Jackson output not correct", 
                     "{\"class\":\"org.apache.cxf.systest.jaxrs.Book\",\"name\":\"CXF in Action\",\"id\":123}",
                     getStringFromInputStream(in).trim());
}
}
