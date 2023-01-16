//141
public class func{
	public void validateRemoteDomain(Element doc,StreamID streamID){
                for (Iterator<DNSUtil.HostAddress> it = hosts.iterator(); it.hasNext();) {
                    try {
                        DNSUtil.HostAddress address = it.next();
                        realHostname = address.getHost();
                        realPort = address.getPort();
                        Log.debug("ServerDialback: RS - Trying to connect to Authoritative Server: " + hostname +
                                "(DNS lookup: " + realHostname + ":" + realPort + ")");
                        // Establish a TCP connection to the Receiving Server
                        socket.connect(new InetSocketAddress(realHostname, realPort),
                                RemoteServerManager.getSocketTimeout());
                        Log.debug("ServerDialback: RS - Connection to AS: " + hostname + " successful");
                        break;
                    }
                    catch (Exception e) {
                        Log.warn("Error trying to connect to remote server: " + hostname +
                                "(DNS lookup: " + realHostname + ")", e);
                    }
                }
}
}
