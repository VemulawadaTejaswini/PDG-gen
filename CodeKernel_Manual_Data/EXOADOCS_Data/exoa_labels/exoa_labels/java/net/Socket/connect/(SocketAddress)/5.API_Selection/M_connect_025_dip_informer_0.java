public class A{
	public dip_informer() {
		try {
			Socket nsSocket = new Socket();
			ServerSocket nsServerSocket = new ServerSocket(2002);
			nsSocket.connect(nsServerSocket.getLocalSocketAddress());
			dip = nsSocket.getLocalAddress().getHostAddress();
			nsServerSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}