//12
public class func{
	public void openClearSocket(InetAddress ia,int port,int timeOut){
        SocketAddress addr = new InetSocketAddress(ia, port);
        clear.connect(new InetSocketAddress(ia, port), timeOut);
}
}
