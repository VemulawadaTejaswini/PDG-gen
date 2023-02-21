public class A{
	public void connect(String host, int port, int timeout) throws ConnectException,UnknownHostException, IOException {
		InetAddress inetAddr = InetAddress.getByName(host);
		SocketAddress sockAddr = new InetSocketAddress(inetAddr, port);
		socket = new Socket();
		socket.connect(sockAddr, timeout * TIME_MULTIPLICATOR);
		input = socket.getInputStream();
		output = socket.getOutputStream();
	}
}