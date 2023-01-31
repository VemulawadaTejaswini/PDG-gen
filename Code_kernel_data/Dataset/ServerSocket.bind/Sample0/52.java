//51
public class func{
	public void openServerSocket(int port,String user){
            serverSocket.bind( new InetSocketAddress( port ), 100 );
            serverSocket.close();
}
}
