//121
public class func{
	public void bind(ServerSocket socket,InetAddress address,int backlog){
        int start = random();
        do {
            try {
                socket.bind(new InetSocketAddress(address, port), backlog);
                return port;
            } catch (BindException e) {
            }
            port = succ(port);
        } while (port != start);
}
}
