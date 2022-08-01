//71
public class func{
	public void createBoundServerSocket(final String uniqueUserName,final Socket controlConnection){
        serverSocket.bind(new InetSocketAddress(controlConnection.getLocalAddress(), controlConnection.getLocalPort()));
        serverSocket.setSoTimeout(this.socketTimeoutInMillis);
}
}
