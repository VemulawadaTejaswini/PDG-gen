//122
public class func{
	public void testORBDoesNotOpenListenSocket(){
            socket.connect(new InetSocketAddress("localhost", port), TestUtils.isWindows () ? 5000 : 1000);
            if ( ! (socket instanceof SSLSocket) && ! socket.isClosed ())
            {
                socket.shutdownOutput ();
            }
}
}
