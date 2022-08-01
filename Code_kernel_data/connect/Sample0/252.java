//251
public class func{
	public void openSocket(InetAddress addr,int port){
        sock.connect(new InetSocketAddress(addr, port), 1);
        X.println("Socket [timeout=" + sock.getSoTimeout() + ", linger=" + sock.getSoLinger() +
            ", sndBuf=" + sock.getSendBufferSize() + ", sndBuf=" + sock.getSendBufferSize() + ']');
}
}
