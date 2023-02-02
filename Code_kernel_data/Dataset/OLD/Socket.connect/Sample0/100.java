//99
public class func{
	public void connect(Socket sock,SocketAddress dest,int sock_conn_timeout){
        if(dest instanceof InetSocketAddress) {
            InetAddress addr=((InetSocketAddress)dest).getAddress();
            if(addr instanceof Inet6Address) {
                Inet6Address tmp=(Inet6Address)addr;
                if(tmp.getScopeId() != 0) {
                    dest=new InetSocketAddress(InetAddress.getByAddress(tmp.getAddress()), ((InetSocketAddress)dest).getPort());
                }
            }
        }
        sock.connect(dest, sock_conn_timeout);
}
}
