//40
public class func{
	public void bind(){
    socketServer.bind(new InetSocketAddress(bindingPort));
    int port = socketServer.getLocalPort();
}
}
