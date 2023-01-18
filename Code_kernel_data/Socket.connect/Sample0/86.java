//85
public class func{
	public void isLocalHostAddressReachable(String hostAddress,int port){
        socket.connect(new InetSocketAddress(hostAddress, port), 500);
        socket.close();
}
}
