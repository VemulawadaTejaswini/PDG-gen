public class A{
	public static Connection createConnection(String host, int port, boolean tcp) throws Exception{
		if(tcp){
			SocketChannel sc = SocketChannel.open();
			sc.configureBlocking(false);
			sc.connect( new InetSocketAddress(host,port) );
			while(!sc.finishConnect()){
				Thread.yield();
			}
			return new ReliableConnection(sc);
		}else {
			DatagramChannel dc = DatagramChannel.open();
			dc.configureBlocking(true);
			dc.socket().bind(null);
			SocketAddress sa =new InetSocketAddress(host,port);
			
			dc.connect(sa);
			return new UnReliableClientConnection(dc,sa);
		}
		
	}
}