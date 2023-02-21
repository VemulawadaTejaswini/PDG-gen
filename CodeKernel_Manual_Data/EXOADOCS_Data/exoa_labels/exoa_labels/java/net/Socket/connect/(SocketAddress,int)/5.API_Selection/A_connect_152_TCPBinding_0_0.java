public class A{
	//...
	public static void main(){
		SocketAddress sockAddr = new InetSocketAddress(inetAddr, port);
		socket = new Socket();
		socket.connect(sockAddr, timeout * TIME_MULTIPLICATOR);
	}
}