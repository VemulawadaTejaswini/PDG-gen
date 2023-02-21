public class A{
	//...
	public static void main(){
		SocketAddress sockaddr = new InetSocketAddress(addr, port);
		//...
		socket = new Socket();
		//...
		socket.connect(sockaddr, timeoutMs);
	}
}