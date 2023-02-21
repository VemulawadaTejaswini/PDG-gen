public class A{
	//...
	public static void main(){
		DatagramChannel dc = DatagramChannel.open();
		//...
		SocketAddress sa =new InetSocketAddress(host,port);
		//...
		dc.connect(sa);
	}
}