//3
public class func{
	public void start(){
        if (sslcontext != null) {
            SSLServerSocketFactory sf = sslcontext.getServerSocketFactory();
            ssock = sf.createServerSocket();
        } else {
            ssock = new ServerSocket();
        }
        ssock.setReuseAddress(true); // probably pointless for port '0'
        ssock.bind(TEST_SERVER_ADDR);
}
}
