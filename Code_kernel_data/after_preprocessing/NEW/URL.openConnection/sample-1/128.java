//128
public class func{
public void dlbQueryTest(){
        URL endpointURL = new URL(dlbEndpoint.getEndpointInfo().getAddress()  + "?js");
        URLConnection connection = endpointURL.openConnection();
        assertEquals("application/javascript;charset=UTF-8", connection.getContentType());
        InputStream jsStream = connection.getInputStream();
        String js = readStringFromStream(jsStream);
        assertNotSame("", js);
}
}
