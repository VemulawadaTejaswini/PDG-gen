//19
public class func{
	public void port(){
            socket.bind(
                new InetSocketAddress("localhost", 0)
            );
            return socket.getLocalPort();
            socket.close();
}
}
