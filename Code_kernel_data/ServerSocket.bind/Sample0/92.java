//91
public class func{
	public void create(SSHClient client,String remoteHostName,String localHost,int localPort,String remoteHost,int remotePort){
            ss.bind(new InetSocketAddress(localHost, localPort));
            final LocalPortForwarder forwarder = client.newLocalPortForwarder(params, ss);
                        forwarder.listen();
}
}
