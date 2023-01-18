//287
public class func{
	public void canConnect(Socket socket,String host,String port){
            InetSocketAddress local = new InetSocketAddress( 0 );
            socket.bind( local );
            socket.connect( address );
            in = socket.getInputStream();
}
}
