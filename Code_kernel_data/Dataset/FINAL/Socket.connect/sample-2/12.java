public class func{
public void createSocketWithTimeout(String host,int port,InetAddress localAddress,int localPort,int timeout){
        plainSocket.bind(local);
        plainSocket.connect(remote, timeout);
        return socketFactory.createSocket(plainSocket, host, port, true);
}
}
