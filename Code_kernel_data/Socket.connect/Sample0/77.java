//76
public class func{
	public void checkPortReady(int port,int timeout){
                socket.connect(new InetSocketAddress("localhost", port));
                socket.close();
}
}
