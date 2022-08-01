//8
public class func{
	public void testAddressTranslation(){
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(null);
        Socket socket1 = new Ec2SocketFactory().createSocket("localhost", serverSocket.getLocalPort());
}
}
