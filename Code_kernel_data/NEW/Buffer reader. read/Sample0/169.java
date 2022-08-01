//168
public class func{
	public void testSSLOpenRequestClose(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        SimpleHttpResponse response = httpParser.readResponse(reader);
        Assert.assertEquals("200", response.getCode());
        Assert.assertEquals(-1, reader.read());
        socket.close();
}
}
