//196
public class func{
	public void PGStream(HostSpec hostSpec,int timeout){
        socket.connect(new InetSocketAddress(hostSpec.getHost(), hostSpec.getPort()), timeout);
        changeSocket(socket);
}
}
