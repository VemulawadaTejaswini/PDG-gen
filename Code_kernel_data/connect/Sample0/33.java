//32
public class func{
	public void testIsMockServerCanRespond(){
            socket.connect(new InetSocketAddress("127.0.0.1", server.getAddress().getPort()));
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            os.write(mockClientData);
}
}
