//0
public class func{
	public void getRandomPort(){
    ServerSocket sock = new ServerSocket();
    sock.bind(null);
    int port = sock.getLocalPort();
    sock.close();
}
}
//1
public class func{
	public void createDynamicTCPSession(){
         ServerSocket s = new ServerSocket();
         s.bind(null);
         port = s.getLocalPort();
         s.close();
}
}
//2
public class func{
	public void test_bindLjava_net_SocketAddress(){
        theSocket = new ServerSocket();
        theSocket.bind(null);
        theSocket.close();
        theSocket = new ServerSocket();
        ServerSocket theSocket2 = new ServerSocket();
}
}
//3
public class func{
	public void test_bindLjava_net_SocketAddressI(){
        theSocket = new ServerSocket();
        theSocket.bind(null, 5);
        theSocket.close();
        theSocket = new ServerSocket();
        ServerSocket theSocket2 = new ServerSocket();
}
}
//4
public class func{
	public void run(){
            ServerSocket ssock = new ServerSocket();
            ssock.bind(null);
            listenPort = ssock.getLocalPort();
            sock = ssock.accept();
            sock.setTcpNoDelay(true);
}
}
//5
public class func{
	public void timeout(){
        ServerSocket server = new ServerSocket();
            server.bind(null);
            IoFuture<IoSession> cf = client.connect(new InetSocketAddress("localhost", server.getLocalPort()));
}
}
//6
public class func{
	public void getAvailablePort(){
            ss = new ServerSocket();
            ss.bind(null);
            return ss.getLocalPort();
}
}
//7
public class func{
	public void test_isConnected(){
        server = new ServerSocket();
        server.bind(theAddress);
        InetSocketAddress boundAddress = new InetSocketAddress(server
                .getInetAddress(), server.getLocalPort());
        client.connect(boundAddress);
        worker = server.accept();
}
}
//8
public class func{
	public void testAddressTranslation(){
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(null);
        Socket socket1 = new Ec2SocketFactory().createSocket("localhost", serverSocket.getLocalPort());
}
}
//9
public class func{
	public void generate_all_kind_of_client_event(){
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(null);
        int port = serverSocket.getLocalPort();
}
}
//10
public class func{
	public void main(String args[]){
        ServerSocket ss = new ServerSocket();
        ss.bind(isa);
        int port = ss.getLocalPort();
}
}
//11
public class func{
	public void test_bindLjava_net_SocketAddress(){
        ServerSocket server = new ServerSocket();
        server.bind(theAddress);
        int sport = server.getLocalPort();
}
}
//12
public class func{
	public void test_setReuseAddressZ(){
        theSocket = new Socket();
        theSocket.connect(theAddress);
        stillActiveSocket = serverSocket.accept();
        serverSocket.close();
            serverSocket = new ServerSocket();
            serverSocket.bind(theAddress);
            fail("Unexpected exception when setReuseAddress is the default case and we bind:"
                    + theAddress.toString() + ":" + ex.toString());
}
}
//13
public class func{
	public void run(){
            server = new ServerSocket();
            server.bind(this.socketAddress);
                new InetSocketAddress(server.getInetAddress(), server.getLocalPort()), this.secretKey);
}
}
//14
public class func{
	public void portAvailable(int port){
      ServerSocket socket = new ServerSocket();
      socket.bind(addr);
      socket.close();
}
}
//15
public class func{
	public void isSocketBindable(InetSocketAddress addr){
    ServerSocket socket = new ServerSocket();
      socket.bind(addr);
      socket.close();
}
}
//16
public class func{
	public void initialize(){
    ServerSocket socket = new ServerSocket();
    socket.bind(clientSocket);
    socket.close();
}
}
//17
public class func{
	public void initialize(){
      socket = new ServerSocket();
      socket.bind(dnSocket);
      socket.close();
}
}
//18
public class func{
	public void isPrimaryAlive(String zkRegistry){
    ServerSocket socket = new ServerSocket();
    socket.bind(clientSocket);
    socket.close();
}
}
//19
public class func{
	public void testOpenServerSocket(final String host){
      serverSocket = new ServerSocket();
      serverSocket.bind(socketAddress);
      if (serverSocket != null) {
        try {
          serverSocket.close();
        } catch (Exception e) {
          //ignore
        }
      }
}
}
//20
public class func{
	public void test_setReuseAddressZ(){
        serverSocket = new ServerSocket();
        serverSocket.bind(anyAddress);
        theAddress = serverSocket.getLocalSocketAddress();
}
}
//21
public class func{
	public void doBind(InetSocketAddress addr){
            ServerSocket svr = new ServerSocket();
            svr.bind(null);
            InetSocketAddress bad = (InetSocketAddress) svr.getLocalSocketAddress();
}
}
//22
public class func{
	public void testShutdownOutput(Bootstrap cb){
        ServerSocket ss = new ServerSocket();
            ss.bind(addr);
}
}
//23
public class func{
	public void initializeDefaultSocketParameters(final InetSocketAddress bindAddress,final InetAddress connectAddress){
            ss = new ServerSocket();
            ss.bind(bindAddress);
}
}
//24
public class func{
	public void testFailBackoff(){
    final ServerSocket ss = new ServerSocket();
    ss.bind(null);
}
}
//25
public class func{
	public void isAvailablePort(int port){
            ss = new ServerSocket(port);
            ss.bind(null);
}
}
//26
public class func{
	public void startListening(String localaddress,int port){
        ServerSocket ss = new ServerSocket();
        ss.bind(sa);
        return new SocketListenKey(ss);
}
}
//27
public class func{
	public void bindServerSocket(InetAddress inetAddr){
        serverSocket = new ServerSocket();
        serverSocket.bind(addr);
}
}
//28
public class func{
	public void createServerSocket(String type,InetSocketAddress inetSocketAddress){
            serverSocketChannel = ServerSocketChannel.open();
            serverSocket = serverSocketChannel.socket();
            serverSocket = new ServerSocket();
        serverSocket.bind(inetSocketAddress);
}
}
//29
public class func{
	public void validatePortIsFree(final String host,final int port){
        serverSocket = new ServerSocket();
        serverSocket.bind(socketAddress);
}
}
//30
public class func{
	public void run(){
            server = new ServerSocket();
            server.bind(socketAddress);
            log.info("Sling Control Server started on " + socketAddress.toString());
            log.error("Failed to start Sling Control Server", ioe);
}
}
