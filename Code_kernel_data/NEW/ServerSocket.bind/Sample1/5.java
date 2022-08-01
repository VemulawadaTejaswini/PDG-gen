//4
public class func{
	public void run(){
            ServerSocket ssock = new ServerSocket();
            ssock.bind(null);
            listenPort = ssock.getLocalPort();
            sock = ssock.accept();
            sock.setTcpNoDelay(true);
}
}
