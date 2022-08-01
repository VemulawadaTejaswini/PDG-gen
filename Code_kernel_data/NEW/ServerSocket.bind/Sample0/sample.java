//0
public class func{
	public void Acceptor(String host,int port){
            InetSocketAddress address = (host == null) ?
                    new InetSocketAddress(port) :
                    new InetSocketAddress(host, port);
            serverSocket.bind(address);
}
}
//1
public class func{
	public void keepOneInterface(InetAddress addr,int port){
      if (addr != null) {
        server.bind(new InetSocketAddress(addr, port));
      }
      else {
        server.bind(new InetSocketAddress(port));
      }
      Keeper result = new Keeper(server, port);
}
}
//2
public class func{
	public void listen(String hostname,int port,F2<Void,BufferedReader,DataOutputStream> protocol){
      socket.bind(U.isEmpty(hostname) ? new InetSocketAddress(port) : new InetSocketAddress(hostname, port));
      Log.info("Starting TCP/IP server", "host", hostname, "port", port);
}
}
//3
public class func{
	public void test_isBound(){
        server.bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        InetSocketAddress boundAddress = new InetSocketAddress(server
                .getInetAddress(), server.getLocalPort());
        client.connect(boundAddress);
        worker = server.accept();
}
}
//4
public class func{
	public void run(){
        if((page.getStr("BIND")!=null)&&(page.getStr("BIND").trim().length()>0))
          serverSocket.bind (new InetSocketAddress(InetAddress.getByName(page.getStr("BIND")),port));
        else
          serverSocket.bind (new InetSocketAddress (port));
        Log.sysOut("Started "+name+" on port "+port);
}
}
//5
public class func{
	public void main(String[] args){
            ss.bind(new InetSocketAddress(0));
            int localPort = ss.getLocalPort();
            SocketChannel channel = SocketChannel.open(new InetSocketAddress("localhost", localPort));
}
}
//6
public class func{
	public void test_bindLjava_net_SocketAddress(){
            theAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
            theSocket.bind(theAddress);
            SocketAddress localAddress = theSocket.getLocalSocketAddress();
            theSocket2.bind(localAddress);
}
}
//7
public class func{
	public void test_bindLjava_net_SocketAddressI(){
            theAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
            theSocket.bind(theAddress, 5);
            SocketAddress inuseAddress = theSocket.getLocalSocketAddress();
            theSocket2.bind(inuseAddress, 5);
}
}
//8
public class func{
	public void connect(BusAddress address,int timeout){
            ss.bind(new InetSocketAddress(address.getParameter("host"), Integer.parseInt(address.getParameter("port"))));
            s = ss.accept();
            s.connect(new InetSocketAddress(address.getParameter("host"), Integer.parseInt(address.getParameter("port"))));
         in = s.getInputStream();
         out = s.getOutputStream();
}
}
//9
public class func{
	public void validateHost(InetAddress host){
            ss.bind(new InetSocketAddress(host, 0));
            s1 = new Socket(host, ss.getLocalPort());
            s2 = ss.accept();
            if (s2 != null) {
                try {
                    s2.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
            if (s1 != null) {
                try {
                    s1.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
}
}
//10
public class func{
	public void testIsPortAvailableValidatesAddress(){
        ss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        int boundPort = ss.getLocalPort();
        assertTrue(ss.isBound());
        assertNotEquals(boundPort, 0);
        assertFalse(Networking.isPortAvailable(boundPort));
        ss.close();
}
}
//11
public class func{
	public void main(String[] args){
        InetSocketAddress s = new InetSocketAddress(InetAddress.getLocalHost(), 0);
        sock.bind(s);
        int port = sock.getLocalPort();
        sock.close();
        Endpoint.publish(address, new GreeterImpl(port));
}
}
//12
public class func{
	public void isLocalHostAddressReachable(String hostAddress,int port){
      serverSocket.bind(new InetSocketAddress(InetAddress.getByName(hostAddress), port));
      port = serverSocket.getLocalPort();
      serverSocket.close();
}
}
//13
public class func{
	public void getPort(){
                sock.bind(new InetSocketAddress(0));
                int value = sock.getLocalPort();
                sock.close();
}
}
//14
public class func{
	public void checkPortIsFree(int port){
      socket.bind(new InetSocketAddress("localhost", port));
      int localPort = socket.getLocalPort();
      socket.close();
}
}
//15
public class func{
	public void setup(){
            s.bind(new InetSocketAddress(0));
            port = s.getLocalPort();
            s.close();
}
}
//16
public class func{
	public void getPort(){
                sock.bind(new InetSocketAddress(0));
                int value = sock.getLocalPort();
                sock.close();
}
}
//17
public class func{
	public void getThriftServerDefBuilder(){
            s.bind(new InetSocketAddress(0));
            port = s.getLocalPort();
            s.close();
}
}
//18
public class func{
	public void findUnusedPort(){
            socket.bind(new InetSocketAddress(0));
            port = socket.getLocalPort();
            socket.close();
}
}
//19
public class func{
	public void port(){
            socket.bind(
                new InetSocketAddress("localhost", 0)
            );
            return socket.getLocalPort();
            socket.close();
}
}
//20
public class func{
	public void test_LocalPort(){
        ss2.bind(new InetSocketAddress("127.0.0.1", 4343));
        assertEquals(ss2.getLocalPort(), 4343);
        ss2.close();
}
}
//21
public class func{
	public void start(Properties props){
        String v = props.getProperty(ADDRESS_PROPERTY);
        InetAddress address = v == null ? null : InetAddress.getByName(v);
        int port = Integer.parseInt(props.getProperty(PORT_PROPERTY, "0"));
        InetSocketAddress socketAddress = new InetSocketAddress(address, port);
        socket.bind(socketAddress);
        Main.log("Started server listening on " + socket.getLocalSocketAddress() + ":"
            + socket.getLocalPort());
}
}
//22
public class func{
	public void performancePreferenceTest(int connectionTime,int latency,int bandwidth){
        InetSocketAddress theAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 0);
        theSocket.bind(theAddress);
        int portNumber = theSocket.getLocalPort();
}
}
//23
public class func{
	public void test_bindLjava_net_SocketAddress(){
        InetSocketAddress theAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 0);
        theSocket.bind(theAddress);
        int portNumber = theSocket.getLocalPort();
}
}
//24
public class func{
	public void test_bindLjava_net_SocketAddressI(){
        InetSocketAddress theAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), 0);
        theSocket.bind(theAddress, 5);
        int portNumber = theSocket.getLocalPort();
}
}
//25
public class func{
	public void test_getLocalSocketAddress(){
        theSocket
                .bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        int localPort = theSocket.getLocalPort();
}
}
//26
public class func{
	public void getPort(int portStart,int retries){
                addr = new InetSocketAddress(InetAddress.getByName(InetAddress.getLocalHost().getHostAddress()),
                                             portStart);
                socket.bind(addr);
                socket.close();
}
}
//27
public class func{
	public void test_isBound(){
        serverSocket.bind(new InetSocketAddress(addr, 0));
        assertTrue("Socket indicated  not bound when it should be (1)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0);
        assertTrue("Socket indicated  not bound when it should be (2)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0, 5, addr);
        assertTrue("Socket indicated  not bound when it should be (3)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0, 5);
        assertTrue("Socket indicated  not bound when it should be (4)",
                serverSocket.isBound());
        serverSocket.close();
}
}
//28
public class func{
	public void testBindError(){
    InetSocketAddress address = new InetSocketAddress("0.0.0.0",0);
    socket.bind(address);
      int min = socket.getLocalPort();
      conf.set("TestRange", min+"-"+min);
      ServerSocket socket2 = new ServerSocket();
}
}
//29
public class func{
	public void testBind(){
    InetSocketAddress address = new InetSocketAddress("0.0.0.0",0);
    socket.bind(address);
      int min = socket.getLocalPort();
      conf.set("TestRange", min+"-"+max);
      ServerSocket socket2 = new ServerSocket();
}
}
//30
public class func{
	public void AEProxyImpl(int _port,long _connect_timeout,long _read_timeout,AEProxyHandler _proxy_handler){
      ss.bind(  new InetSocketAddress( InetAddress.getByName("127.0.0.1"), port), 128 );
      if ( port == 0 ){
        
        port  = ss.getLocalPort();
      }
        new AEThread("AEProxy:connect.loop")
        {
          public void
          runSupport()
          {
            selectLoop( connect_selector );
          }
        };
      connect_thread.setDaemon( true );
      connect_thread.start();
}
}
//31
public class func{
	public void testJaasDualStopWithOpenConnection(){
        InetAddress address = InetAddress.getLocalHost();
        socket.bind(new InetSocketAddress(address, listenPort));
        LOG.info("bound address: " + socket);
        socket.close();
}
}
//32
public class func{
	public void acceptUnbound(){
        sslServerSocket.bind(new java.net.InetSocketAddress(serverPort));
        if (!sslServerSocket.isBound())
            throw new Exception("Server socket is not bound!");
        Socket sslSocket = sslServerSocket.accept();
        sslServerSocket.close();
}
}
//33
public class func{
	public void runHttpServer(int port){
        ss.bind(new InetSocketAddress("localhost", port));
        System.err.println("Serving file leak stats on http://localhost:"+ss.getLocalPort()+"/ for stats");
}
}
//34
public class func{
	public void freePort(){
      socket.bind(new InetSocketAddress(0));
      return socket.getLocalPort();
}
}
//35
public class func{
	public void test(InetAddress addr){
            ss.bind(new InetSocketAddress(addr, 0));
            int port = ss.getLocalPort();
}
}
//36
public class func{
	public void createServerSocket(int port){
            ss.bind(new InetSocketAddress(bindAddr, port), backlog);
            ss.close();
            ss.close();
}
}
//37
public class func{
	public void main(String[] args){
        s.bind (new InetSocketAddress (0));
        int port = s.getLocalPort ();
}
}
//38
public class func{
	public void run2(Context context){
    InetSocketAddress sa = new InetSocketAddress("127.0.0.1", 0);
    ss.bind(sa);
    String localPortString = Integer.toString(ss.getLocalPort());
}
}
//39
public class func{
	public void test(InetAddress addr){
            ss.bind(new InetSocketAddress(addr, 0));
            int port = ss.getLocalPort();
}
}
//40
public class func{
	public void bind(){
    socketServer.bind(new InetSocketAddress(bindingPort));
    int port = socketServer.getLocalPort();
}
}
//41
public class func{
	public void run2(Context context){
    InetSocketAddress sa = new InetSocketAddress("127.0.0.1", 0);
    ss.bind(sa);
    int localPort = ss.getLocalPort();
}
}
//42
public class func{
	public void runNativeSide(String[] args){
            serverSocket.bind(new InetSocketAddress(Utils.getLocalHostAddress(), port));
            if(serverSocket != null) {
              try {
                serverSocket.close();
              } catch(Exception ex) {
              }
            }
        if(serverSocket == null) {
          if(exception == null) {
            throw new IllegalStateException("Failed to create the server socket for native side communication!");
          }
          throw exception;
        }
}
}
//43
public class func{
	public void startConsole(){
                            InetSocketAddress isa = new InetSocketAddress(host, 0);
                            testSock.bind(isa);
                            if (testSock != null) try { testSock.close(); } catch (IOException ioe) {}
}
}
//44
public class func{
	public void getFreePort(){
                ss.bind(new InetSocketAddress(port));
                ss.close();
                ss = new ServerSocket();
                ss.setReuseAddress(false);
}
}
//45
public class func{
	public void startConsole(){
                                InetSocketAddress isa = new InetSocketAddress(host, 0);
                                testSock.bind(isa);
                                if (testSock != null) try { testSock.close(); } catch (IOException ioe) {}
}
}
//46
public class func{
	public void setup(ExecutorType clientExecutor,ExecutorType serverExecutor,PayloadSize requestSize,PayloadSize responseSize,FlowWindowSize windowSize,ChannelType channelType,int maxConcurrentStreams,int channelCount){
      sock.bind(new InetSocketAddress(BENCHMARK_ADDR, 0));
      SocketAddress address = sock.getLocalSocketAddress();
      sock.close();
      serverBuilder = NettyServerBuilder.forAddress(address);
      channelBuilder = NettyChannelBuilder.forAddress(address);
}
}
//47
public class func{
	public void getFreePort(){
                ss.bind(new InetSocketAddress(port));
                ss.close();
                ss = new ServerSocket();
                ss.setReuseAddress(false);
}
}
//48
public class func{
	public void main(String args[]){
            ss = new ServerSocket();
            ss.bind( new InetSocketAddress(port) );
            ss.close();
}
}
//49
public class func{
	public void main(String args[]){
        ss = new ServerSocket();
        ss.bind( new InetSocketAddress(port) );
        ss.close();
}
}
//50
public class func{
	public void start(){
                        serverSocket.bind(new InetSocketAddress(this.inetAddress, this.port), this.backlog);
                serverSocket.setSoTimeout(this.timeout);
                int serverPort = serverSocket.getLocalPort();
}
}
//51
public class func{
	public void openServerSocket(int port,String user){
            serverSocket.bind( new InetSocketAddress( port ), 100 );
            serverSocket.close();
}
}
//52
public class func{
	public void getFreePort(){
                ss.bind(new InetSocketAddress(NetUtil.LOCALHOST, port));
                ss.close();
}
}
//53
public class func{
	public void findFreePort(int startRange,int endRange,int[] excluding){
          socket.bind(new InetSocketAddress("127.0.0.1", i)); //$NON-NLS-1$
          socket.close();
}
}
//54
public class func{
	public void canBindToLocalSocket(String host,int port){
        socket.bind(new InetSocketAddress(host, port));
          socket.close();
}
}
//55
public class func{
	public void getValidatedDebugPort(){
                server.bind( new InetSocketAddress( port ) );
                server.close();
}
}
//56
public class func{
	public void getFreePort(){
                ss.bind(new InetSocketAddress(LOCALHOST, port));
                ss.close();
}
}
//57
public class func{
	public void ServerSocketTests(){
            s2.bind( new InetSocketAddress(s1.getLocalPort()) );
}
}
//58
public class func{
	public void test_bindLjava_net_SocketAddressI(){
        theAddress = new InetSocketAddress(InetAddress.getLocalHost(), 0);
        theSocket.bind(theAddress, 4);
        localAddress = theSocket.getLocalSocketAddress();
}
}
//59
public class func{
	public void paintComponent(BufferedImage image,Rectangle[] rectangles){
      String localHostAddress = Utils.getLocalHostAddress();
      if(localHostAddress == null) {
        localHostAddress = "127.0.0.1";
      }
      serverSocket.bind(new InetSocketAddress(InetAddress.getByName(localHostAddress), 0));
}
}
//60
public class func{
	public void pickAddress(){
                    if (bindAny) {
                        inetSocketAddress = new InetSocketAddress(port);
                    } else {
                        inetSocketAddress = new InetSocketAddress(bindAddressDef.inetAddress, port);
                    }
                    log(Level.FINEST, "Trying to bind inet socket address:" + inetSocketAddress);
                    serverSocket.bind(inetSocketAddress, 100);
                    log(Level.FINEST, "Bind successful to inet socket address:" + inetSocketAddress);
}
}
//61
public class func{
	public void inheritedChannel(){
                serverSocket.bind(
                     new InetSocketAddress(InetAddress.getLocalHost(), PORT));
}
}
//62
public class func{
	public void createServerSocket(int port){
      if (port == 0) {
        sock.bind(null);
        serverPort = sock.getLocalPort();
      } else {
        sock.bind(new InetSocketAddress(port));
      }
      throw new IOException("Could not create ServerSocket on port " + port + "." +
                            ioe);
}
}
//63
public class func{
	public void shouldSendMessage(){
        server.bind(new InetSocketAddress((InetAddress) null, pid2.getReplicaPort()));
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        assertEquals(1, inputStream.readInt());
}
}
//64
public class func{
	public void activeConnectionShouldSendLocalId(){
        server.bind(new InetSocketAddress((InetAddress) null, pid2.getReplicaPort()));
        Socket socket = server.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        assertEquals(1, inputStream.readInt());
        inputStream.close();
}
}
//65
public class func{
	public void run(){
            serverSocket.bind(new InetSocketAddress(port));
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            socket.shutdownOutput();
}
}
//66
public class func{
	public void expectBadClientSingle(){
            server.bind(new InetSocketAddress(LOCALHOST, SERVER_PORT));
            return badSend(new Socket(LOCALHOST, SERVER_PORT), server.accept(), null);
}
}
//67
public class func{
	public void run(){
                server.bind(new InetSocketAddress( _port ) );
                s = server.accept();
                TunnelSocket ts = (TunnelSocket)s;
                ts.verify();
                System.out.println( ts.getSubject() );
}
}
//68
public class func{
	public void createOutProcessMessagingInterface(){
            serverSocket.bind(new InetSocketAddress(InetAddress.getByName(localHostAddress), 0));
}
}
//69
public class func{
	public void getUnusedPort(){
                InetSocketAddress address = new InetSocketAddress(InetAddress.getByName("localhost"), port);
                serverSocket.bind(address, 10);
}
}
//70
public class func{
	public void testStateAfterClose(){
        ss.bind(new InetSocketAddress(Inet4Address.getLocalHost(), 0));
        InetSocketAddress boundAddress = (InetSocketAddress) ss.getLocalSocketAddress();
}
}
//71
public class func{
	public void createBoundServerSocket(final String uniqueUserName,final Socket controlConnection){
        serverSocket.bind(new InetSocketAddress(controlConnection.getLocalAddress(), controlConnection.getLocalPort()));
        serverSocket.setSoTimeout(this.socketTimeoutInMillis);
}
}
//72
public class func{
	public void newJVM(String displayName,TaskListener listener,JVMBuilder vmb,FilePath workDir,ClasspathBuilder classpath){
        serverSocket.bind(new InetSocketAddress("localhost",0));
        serverSocket.setSoTimeout(10*1000);
}
}
//73
public class func{
	public void createSeleniumRCVM(File standaloneServerJar,TaskListener listener,Map<String,String> properties,Map<String,String> envVariables){
        serverSocket.bind(new InetSocketAddress("localhost", 0));
        serverSocket.setSoTimeout(10000);
}
}
//74
public class func{
	public void main(String... args){
            ss.bind(new InetSocketAddress(params.getLocalHost(), params.getLocalPort()));
                ssh.newLocalPortForwarder(params, ss).listen();
}
}
//75
public class func{
	public void test_bindLjava_net_SocketAddress(){
            theSocket.bind(new InetSocketAddress(InetAddress
                    .getByAddress(Support_Configuration.nonLocalAddressBytes),
                    0));
}
}
//76
public class func{
	public void test_bindLjava_net_SocketAddressI(){
            theSocket.bind(new InetSocketAddress(InetAddress
                    .getByAddress(Support_Configuration.nonLocalAddressBytes),
                    0), 5);
}
}
//77
public class func{
	public void listen(InetAddress localEp){
        InetSocketAddress address = new InetSocketAddress(localEp, DatabaseDescriptor.getStoragePort());
            ss.bind(address);
}
}
//78
public class func{
	public void getServerSockets(InetAddress localEp){
            InetSocketAddress address = new InetSocketAddress(localEp, DatabaseDescriptor.getStoragePort());
                socket.bind(address,500);
}
}
//79
public class func{
	public void getServerSocket(InetAddress localEp){
        InetSocketAddress address = new InetSocketAddress(localEp, DatabaseDescriptor.getStoragePort());
            socket.bind(address);
}
}
//80
public class func{
	public void main(String[] args){
        ss.bind(new InetSocketAddress(addr, 0));
        addr = (Inet6Address)InetAddress.getByAddress (
            addr.getAddress()
        );
}
}
//81
public class func{
	public void bind(ServerSocket socket,int portstart,int retries){
                addr = new InetSocketAddress(getBind(), portstart);
                socket.bind(addr);
                setPort(portstart);
                log.info("Receiver Server Socket bound to:"+addr);
}
}
//82
public class func{
	public void bind(ServerSocket socket,int portstart,int retries){
                    addr = new InetSocketAddress(getBind(), port);
                    socket.bind(addr);
                    setPort(port);
                    log.info("Receiver Server Socket bound to:"+addr);
}
}
//83
public class func{
	public void getLocalPort(ServerSocket socket,String hostname,int port){
        addr = new InetSocketAddress(hostname, port);
        socket.bind(addr);
        log.info("Receiver Server Socket bound to:" + addr);
}
}
//84
public class func{
	public void badSend(Socket from,Socket to,ServerSocket server){
                another.bind(new InetSocketAddress(LOCALHOST, SERVER_PORT));
                another.setReuseAddress(true);
}
}
//85
public class func{
	public void isPortAvailable(final String port){
            serverSocket.bind( new InetSocketAddress( Integer.parseInt( port ) ) );
}
}
//86
public class func{
	public void createServerSocket(int nport,int backlog,InetAddress bindAddr,List<GatewayTransportFilter> transportFilters,int socketBufferSize){
        result.bind(new InetSocketAddress(bindAddr, nport), backlog);
        BindException throwMe = new BindException(
            LocalizedStrings.SocketCreator_FAILED_TO_CREATE_SERVER_SOCKET_ON_0_1
                .toLocalizedString(new Object[] { bindAddr,
                    Integer.valueOf(nport) }));
        throwMe.initCause(e);
}
}
//87
public class func{
	public void createServerSocket(int nport,int backlog,InetAddress bindAddr,int socketBufferSize){
            result.bind(new InetSocketAddress(bindAddr, nport), backlog);
            BindException throwMe = new BindException(LocalizedStrings.SocketCreator_FAILED_TO_CREATE_SERVER_SOCKET_ON_0_1.toLocalizedString(new Object[] {bindAddr, Integer.valueOf(nport)}));
            throwMe.initCause(e);
}
}
//88
public class func{
	public void forwardLocalPortTo(int localPort,String targetHost,int targetPort){
    ss.bind(new InetSocketAddress(params.getLocalHost(), params
        .getLocalPort()));
          ssh.newLocalPortForwarder(params, ss).listen();
}
}
//89
public class func{
	public void initializeClusterManagerCallbackServer(){
    serverSocket.bind(new InetSocketAddress(0));
    TServerSocket tSocket = new TServerSocket(serverSocket, soTimeout);
}
}
//90
public class func{
	public void TraceServer(ServerConfigurationFactory serverConfiguration,String hostname){
    sock.bind(new InetSocketAddress(hostname, port));
    final TServerTransport transport = new TServerSocket(sock);
    TThreadPoolServer.Args options = new TThreadPoolServer.Args(transport);
}
}
//91
public class func{
	public void create(SSHClient client,String remoteHostName,String localHost,int localPort,String remoteHost,int remotePort){
            ss.bind(new InetSocketAddress(localHost, localPort));
            final LocalPortForwarder forwarder = client.newLocalPortForwarder(params, ss);
                        forwarder.listen();
}
}
//92
public class func{
	public void expectBadServerSingle(){
            server.bind(new InetSocketAddress(LOCALHOST, SERVER_PORT));
            Socket client = new Socket(LOCALHOST, SERVER_PORT);
}
}
//93
public class func{
	public void openSocket(){
      Log.info("Opening port to listen", "port", port);
      InetSocketAddress addr = new InetSocketAddress(port);
      socket.bind(addr);
      Log.info("Opened socket", "address", addr);
}
}
//94
public class func{
	public void testSocketSimple(){
        for (port = 9900; port < 9999; port++) {
            try {
                ss.bind(new InetSocketAddress("127.0.0.1", port));
                lastEx = null;
                break;
            } catch (IOException ex) {
                lastEx = ex;
            }
        }
}
}
//95
public class func{
	public void isPortAvailable(InetAddress localAddress,int port){
                ss.bind(new InetSocketAddress(localAddress, port));
}
}
//96
public class func{
	public void isRoot0(){
                ss.bind(new InetSocketAddress(i));
}
}
//97
public class func{
	public void startMemcachedServer(){
    serverSocket.bind(new InetSocketAddress(getBindAddress(), serverPort));
}
}
//98
public class func{
	public void doWithBlockedPort(final int port,Runnable action){
    serverSocket.bind(new InetSocketAddress(port));
}
}
//99
public class func{
	public void createServerSocket(int port,int backlog){
        serverSocket.bind(new InetSocketAddress(port), backlog);
}
}
//100
public class func{
	public void isAddressValid(InetAddress addr){
            ss.bind(new InetSocketAddress(addr, 0));
}
}
//101
public class func{
	public void main(String[] args){
        ss.bind(new InetSocketAddress(addr, 0));
}
}
//102
public class func{
	public void openChannel(int listenPort,Boolean isSSL){
    serverSocket.bind (new InetSocketAddress (listenPort));
}
}
//103
public class func{
	public void start(){
                    serverSocket.bind(new InetSocketAddress(this.inetAddress, this.port), this.backlog);
}
}
//104
public class func{
	public void createServerSocket(String listenAddress,int port){
        socket.bind(new InetSocketAddress(listenAddress, port));
}
}
//105
public class func{
	public void Acceptor(LogConfig config,Queue<SocketChannel> acceptQueue,Selector selector){
            serverSocket.bind(new InetSocketAddress(config.port));
}
}
//106
public class func{
	public void Acceptor(LogConfig config,Queue<SocketChannel> acceptQueue,Selector selector){
            serverSocket.bind(new InetSocketAddress(config.port),
                    config.listenQSize);
}
}
//107
public class func{
	public void main(String[] args){
            new InetSocketAddress((port == -1) ? 0 : port);
        serverSocket.bind(bindAddr);
        log.println();
}
}
//108
public class func{
	public void createServerSocket(int port){
        serverSocket.bind(new InetSocketAddress(port));
}
}
//109
public class func{
	public void bindSocket(ServerSocket socket){
        socket.bind(new InetSocketAddress(getPort()), 2 * getMaxActiveClientCount());
}
}
//110
public class func{
	public void createBoundServerSocket(){
        serverSocket.bind(new InetSocketAddress(this.sourcePort));
}
}
//111
public class func{
	public void trySocket(int port){
            s.bind(new InetSocketAddress(address,port));
}
}
//112
public class func{
	public void bind(ServerSocket socket,int portstart,int retries){
                addr = new InetSocketAddress(port);
                socket.bind(addr);
}
}
//113
public class func{
	public void test(){
            ss.bind(new InetSocketAddress(0));
            Server s = new Server(ss);
            s.start();
}
}
//114
public class func{
	public void installWithJMXPortConflict(){
            serverSocket.bind(new InetSocketAddress(address, 7799));
}
}
//115
public class func{
	public void createServerSocketChannel(int port){
      serverSocket.bind(new InetSocketAddress(port));  // bind to the port to listen.
}
}
//116
public class func{
	public void tryBind(int localPort){
                ss.bind(new InetSocketAddress("localhost", localPort));
}
}
//117
public class func{
	public void createServerSocketChannel(InetAddress bindingInetAddress,int startPort,ServerSocketConfigurator serverSocketConfigurator){
        serverSocket.bind(
          new InetSocketAddress(bindingInetAddress, port));
}
}
//118
public class func{
	public void testCreateServerSocket(){
        serverSocket.bind(new InetSocketAddress(0));
        testSocket(serverSocket, 50);
}
}
//119
public class func{
	public void openServerSocket(int port,String user){
        serverSocket.bind( new InetSocketAddress( port ) );
}
}
//120
public class func{
	public void main(String[] args){
        ss.bind(new InetSocketAddress("localhost",0));
}
}
//121
public class func{
	public void bind(ServerSocket socket,InetAddress address,int backlog){
        int start = random();
        do {
            try {
                socket.bind(new InetSocketAddress(address, port), backlog);
                return port;
            } catch (BindException e) {
            }
            port = succ(port);
        } while (port != start);
}
}
//122
public class func{
	public void recreateServerSocket(int fdn){
        ss.bind(new InetSocketAddress(0));
}
}
//123
public class func{
	public void isPortFree(int port){
      socket.bind(new InetSocketAddress(port));
}
}
//124
public class func{
	public void run(){
            InetSocketAddress listenAddress = new InetSocketAddress(listenPort);
            serverSocket.bind(listenAddress);
}
}
//125
public class func{
	public void main(String[] args){
    sock.bind(new InetSocketAddress(2300));
}
}
//126
public class func{
	public void ServerSocketTests(){
        s1.bind( new InetSocketAddress(0) );
}
}
//127
public class func{
	public void createServerSocket(int port,int backlog,InetAddress ifAddress){
        serverSocket.bind(new InetSocketAddress(ifAddress, port), backlog);
}
}
//128
public class func{
	public void trySocket(int port){
            s.bind(new InetSocketAddress(address,port));
}
}
//129
public class func{
	public void testRunServer(){
        sock.bind(new InetSocketAddress("0.0.0.0", PORT));
}
}
//130
public class func{
	public void available(int port){
            ss.bind(new InetSocketAddress((InetAddress) null, port), 0);
}
}
//131
public class func{
	public void serve(int port){
        InetSocketAddress address = new InetSocketAddress(port);
        ss.bind(address);
}
}
//132
public class func{
	public void isPortBound(String address,int port,String portName,int potentialErrorCode){
            serverSocket.bind(new InetSocketAddress(address, port));
            throw new StorageInstallerException("The " + portName + " (" + address + ":" + port
                + ") is already in use. " + "Installation cannot proceed.", potentialErrorCode);
}
}
//133
public class func{
	public void createServerSocketUsingPortRange(InetAddress ba,int backlog,boolean isBindAddress,boolean useNIO,int tcpBufferSize,int[] tcpPortRange){
          InetSocketAddress addr = new InetSocketAddress(isBindAddress ? ba : null, localPort);
          socket.bind(addr, backlog);
}
}
//134
public class func{
	public void ServerSocketChannelAcceptor(int listenPort){
            sock.bind(new InetSocketAddress(listenPort), 5);
}
}
//135
public class func{
	public void isPortAvailable(int port){
      InetSocketAddress sa = new InetSocketAddress(port);
      serverSocket.bind(sa);
}
}
//136
public class func{
	public void bind(ServerSocket socket,InetSocketAddress address,int backlog,Configuration conf,String rangeConf){
            InetSocketAddress temp = new InetSocketAddress(address.getAddress(),
                port);
            socket.bind(temp, backlog);
}
}
//137
public class func{
	public void createServerSocket(String type,int port){
        serverSocket.bind(new InetSocketAddress(port));
}
}
//138
public class func{
	public void createServerSocketTry(String listenAddress,int port,boolean ssl){
            socket.bind(new InetSocketAddress(listenAddress, port));
            throw DbException.convertIOException(e, "port: " + port + " ssl: " + ssl);
}
}
//139
public class func{
	public void createServerSocket(){
      final InetSocketAddress endpoint = new InetSocketAddress(host, port);
      result.bind(endpoint);
      logger.info("Bound control endpoint at {}:{}", host, port);
      throw new IllegalStateException("Failed to bind control endpoint at " +  host + ":" + port, e);
}
}
//140
public class func{
	public void startFailed(){
            s.bind(new InetSocketAddress(Inet4Address.getByName(host),port));
            agent.setPort(port);
            agent.setHost(host);
            agent.initialise();
            agent.start();
}
}
//141
public class func{
	public void start(){
        sock.bind(null);
        address = new InetSocketAddress(hostname, sock.getLocalPort());
        port = address.getPort();
}
}
