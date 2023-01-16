//98
public class func{
	public void test(InetAddress addr){
            Socket s = Sdp.openSocket();
                s.connect(new InetSocketAddress(addr, port));
                Socket peer = ss.accept();
                    testConnection(s.getOutputStream(), peer.getInputStream());
}
}
