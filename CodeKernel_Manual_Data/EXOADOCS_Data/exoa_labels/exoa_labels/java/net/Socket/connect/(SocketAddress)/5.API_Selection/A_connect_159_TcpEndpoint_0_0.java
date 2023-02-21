public class A{
	//...
	public static void main(){
		Socket socket;
		//...
		SocketAddress addr = new InetSocketAddress(h, p);
		//...
		socket.connect(addr);
	}
}