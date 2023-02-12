public class func{
public void testProxyWhiteList(){
            SimpleHttpResponse response = readResponse(input);
            Assert.assertEquals("403", response.getCode());
            Assert.assertEquals(-1, input.read());
            OutputStream output = socket.getOutputStream();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
}
}
