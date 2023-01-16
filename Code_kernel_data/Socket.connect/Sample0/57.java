//56
public class func{
	public void createDataOutputStream(){
    SocketAddress socketAddress = new InetSocketAddress(address, port);
    socket.connect(socketAddress, connectionTimeout);
    OutputStream os = socket.getOutputStream();
    TimeoutOutputStream tos = new TimeoutOutputStream(os, writeTimeout);
    return new DataOutputStream(tos);
}
}
