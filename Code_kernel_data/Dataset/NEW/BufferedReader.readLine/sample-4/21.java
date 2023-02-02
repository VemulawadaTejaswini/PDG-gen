//21
public class func{
public void testReaderOnClientAsResponseEntity(){
        Response response = target().path("test/getReader").request().get();
        assertEquals(200, response.getStatus());
        final Reader reader = response.readEntity(Reader.class);
        assertNotNull(reader);
        BufferedReader br = new BufferedReader(reader);
        assertEquals(GET_READER_RESPONSE, br.readLine());
}
}
