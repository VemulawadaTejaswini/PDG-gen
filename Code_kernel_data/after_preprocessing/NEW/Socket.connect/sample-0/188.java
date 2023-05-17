//188
public class func{
public void createSocket(InetAddress address,int port,boolean ssl){
                socket.connect(new InetSocketAddress(address, port),
                        SysProperties.SOCKET_CONNECT_TIMEOUT);
}
}
