//98
public class func{
	public void doWithBlockedPort(final int port,Runnable action){
    serverSocket.bind(new InetSocketAddress(port));
}
}
