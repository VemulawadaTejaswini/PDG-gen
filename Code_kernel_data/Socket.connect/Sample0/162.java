//161
public class func{
	public void createOutgoingSession(String localDomain,String remoteDomain,int port){
                    socket.connect(new InetSocketAddress(hostname, realPort),
                            RemoteServerManager.getSocketTimeout());
                    Log.debug("ServerDialback: OS - Connection to " + remoteDomain + ":" + port + " successful");
                    Log.warn("Error trying to connect to remote server: " + remoteDomain +
                            "(DNS lookup: " + hostname + ":" + realPort + ")", e);
}
}
