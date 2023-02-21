public class A{
	public static boolean connect(String address, int port) {
		
		Debug.println("Connecting to " + address + ":" + port + "...");
		try {
			InetAddress addr = InetAddress.getByName(address);
			
			SocketAddress sockaddr = new InetSocketAddress(addr, port);
			
			socket = new Socket();
			
			socket.connect(sockaddr, timeoutMs);
			
			Thread t = new ClientConnectionThread(socket);
			t.setDaemon(false);
			t.start();
			return true;
			
		} catch (UnknownHostException e) {
		} catch (SocketTimeoutException e) {
		} catch (IOException e) {
		}
		return false;
	}
}