//93
public class func{
	public void loopUntilHMSReady(int port){
        socket.connect(new InetSocketAddress(port), 5000);
        socket.close();
}
}
