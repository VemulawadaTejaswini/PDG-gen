public class func{
public void testClientRequestStallsContentProxyIdlesTimeout(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            SimpleHttpResponse response = parser.readResponse(reader);
            Assert.assertTrue(Integer.parseInt(response.getCode()) >= 500);
            String connectionHeader = response.getHeaders().get("connection");
            Assert.assertNotNull(connectionHeader);
            Assert.assertTrue(connectionHeader.contains("close"));
            Assert.assertEquals(-1, reader.read());
}
}
