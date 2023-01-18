//97
public class func{
	public void test(InetAddress addr){
                s.connect(new InetSocketAddress(addr, port));
                Socket peer = ss.accept();
                    testConnection(s.getOutputStream(), peer.getInputStream());
}
}
