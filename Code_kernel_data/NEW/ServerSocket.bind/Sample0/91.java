//90
public class func{
	public void TraceServer(ServerConfigurationFactory serverConfiguration,String hostname){
    sock.bind(new InetSocketAddress(hostname, port));
    final TServerTransport transport = new TServerSocket(sock);
    TThreadPoolServer.Args options = new TThreadPoolServer.Args(transport);
}
}
