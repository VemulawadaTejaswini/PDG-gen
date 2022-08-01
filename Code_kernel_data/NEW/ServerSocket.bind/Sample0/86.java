//85
public class func{
	public void isPortAvailable(final String port){
            serverSocket.bind( new InetSocketAddress( Integer.parseInt( port ) ) );
}
}
