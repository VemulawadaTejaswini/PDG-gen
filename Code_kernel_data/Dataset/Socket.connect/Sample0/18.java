//17
public class func{
	public void connect(final InetAddress host,final int port,final int timeout){
        socket.connect(new InetSocketAddress(host, port), timeout);
        socket.setSoTimeout(timeout);
        setInput(new BufferedReader(new InputStreamReader(socket.getInputStream())));
        setOutput(socket.getOutputStream());
}
}
