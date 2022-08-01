//5
public class func{
	public void timeout(){
        ServerSocket server = new ServerSocket();
            server.bind(null);
            IoFuture<IoSession> cf = client.connect(new InetSocketAddress("localhost", server.getLocalPort()));
}
}
