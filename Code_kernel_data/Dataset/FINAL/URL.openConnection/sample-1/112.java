public class func{
public void testPetStore(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "text/xml");
        InputStream in = connect.getInputStream();
        assertNotNull(in);
        assertEquals(PetStore.CLOSED, getStringFromInputStream(in)); 
}
}
