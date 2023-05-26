public class func{
public void utilsTest(){
        URL endpointURL = new URL(dlbEndpoint.getEndpointInfo().getAddress()  + "?js&nojsutils");
        URLConnection connection = endpointURL.openConnection();
        assertEquals("application/javascript;charset=UTF-8", connection.getContentType());
        InputStream jsStream = connection.getInputStream();
        String jsString = readStringFromStream(jsStream);
        assertFalse(jsString.contains("function CxfApacheOrgUtil"));
}
}
