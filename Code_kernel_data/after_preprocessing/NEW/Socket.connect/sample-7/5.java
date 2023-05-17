//5
public class func{
public void createSocket(final String host,final int port,final InetAddress localAddress,final int localPort,final HttpConnectionParams params){
        socket.setSoTimeout(params.getSoTimeout());
        socket.bind(localaddr);
        ServerNameIndicator.setServerNameIndication(host, (SSLSocket)socket);
        socket.connect(remoteaddr, timeout);
        verifyPeerIdentity(host, port, socket);
}
}
