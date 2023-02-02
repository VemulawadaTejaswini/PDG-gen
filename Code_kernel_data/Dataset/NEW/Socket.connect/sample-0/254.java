//254
public class func{
public void create(SocketConnectionInfos connectionInfos){
        socket.connect(new InetSocketAddress(connectionInfos.getHost(), connectionInfos.getPort()), socketConnectTimeoutInMillis);
        return new SocketOutputStream(socket);
}
}
