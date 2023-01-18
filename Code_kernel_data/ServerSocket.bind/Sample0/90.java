//89
public class func{
	public void initializeClusterManagerCallbackServer(){
    serverSocket.bind(new InetSocketAddress(0));
    TServerSocket tSocket = new TServerSocket(serverSocket, soTimeout);
}
}
