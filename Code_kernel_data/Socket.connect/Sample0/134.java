//133
public class func{
	public void isPortOpen(InetAddress pAddress,int pPort){
            SocketAddress sa = new InetSocketAddress(pAddress, pPort);
            socket.connect(sa, 200);
            return socket.isConnected();
}
}
