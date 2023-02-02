//256
public class func{
public void create(HostAndPort hostAndPort){
        socket.connect(new InetSocketAddress(hostAndPort.getHost(), hostAndPort.getPort()), socketConnectTimeoutInMillis);
        return new SocketWriter(socket, charset);
}
}
