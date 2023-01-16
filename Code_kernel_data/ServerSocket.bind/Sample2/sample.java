//0
public class func{
	public void isTcpPortAvailable(InetSocketAddress localAddress){
            ss = new ServerSocket();
            ss.setReuseAddress(false);
            ss.bind(localAddress);
            ss.close();
}
}
//1
public class func{
	public void testSetReuseAddress(){
        ServerSocket serverSock2 = new ServerSocket();
        serverSock2.setReuseAddress(true);
        serverSock2.bind(addr);
        serverSock2.close();
}
}
//2
public class func{
	public void test_setReuseAddressZ(){
            serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(false);
            serverSocket.bind(theAddress);
            fail("No exception when setReuseAddress is false and we bind:" + theAddress.toString());
}
}
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
//4
public class func{
	public void test_setReuseAddressZ(){
        theSocket = new Socket();
        theSocket.connect(theAddress);
        stillActiveSocket = serverSocket.accept();
        serverSocket.close();
            serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(true);
            serverSocket.bind(theAddress);
            fail("Unexpected exception when setReuseAddress is true and we bind:"
                    + theAddress.toString() + ":" + ex.toString());
}
}
//5
public class func{
	public void createBoundServerSocket(final InetSocketAddress bindAddress){
        final ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(bindAddress);
}
}
//6
public class func{
	public void testSetReuseAddress(){
        final ServerSocket serverSock = new ServerSocket();
        serverSock.setReuseAddress(true);
        serverSock.bind(addr);
}
}
//7
public class func{
	public void maybeInitJmx(){
                ServerSocket ss = new ServerSocket();
                ss.setReuseAddress(true);
                ss.bind(null);
                int jmxport = ss.getLocalPort();
                ss.close();
                if (jmxport == -1) {
                    log.warn("[init.jmx] failed to get a port");
                } else {
                    try {
                        jmxremote = new MBeanRemotingSupport(jmxport);
                        jmxremote.start();
                        log.info("[init.jmx] port={}", jmxport);
                    } catch (Exception e) {
                        log.error("[init.jmx]", e);
                    }
                }
}
}
//8
public class func{
	public void findNextPort(){
      ServerSocket serverSocket = new ServerSocket();
      serverSocket.setReuseAddress(true); // this allows the server port to be bound to even if it's in TIME_WAIT
      serverSocket.bind(inetSocketAddress);
      port = serverSocket.getLocalPort();
      serverSocket.close();
}
}
//9
public class func{
	public void test_setReuseAddressZ(){
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(false);
        serverSocket.bind(anyAddress);
        SocketAddress theAddress = serverSocket.getLocalSocketAddress();
}
}
//10
public class func{
	public void test_setReuseAddressZ(){
        serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(anyAddress);
        theAddress = serverSocket.getLocalSocketAddress();
}
}
//11
public class func{
	public void findPort(){
                serverSocket = new ServerSocket();
                serverSocket.setReuseAddress(true);
                serverSocket.bind(sa);
}
}
//12
public class func{
	public void createSocketListener(final InetSocketAddress listenerAddress){
        final ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(listenerAddress);
        return new SocketListener(serverSocket, this.handleExecutor, this.handleMessageTaskFactory);
}
}
