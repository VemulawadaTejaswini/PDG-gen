//87
public class func{
	public void isPortFree(int port){
            socket.connect(new InetSocketAddress("localhost", port), 200);
            socket.close();
}
}
