//9
public class func{
	public void test_setReuseAddressZ(){
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(false);
        serverSocket.bind(anyAddress);
        SocketAddress theAddress = serverSocket.getLocalSocketAddress();
}
}
