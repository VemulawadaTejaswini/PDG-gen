public class func{
public void createConnection(URI theUri){
    SocketAddress socketAddress = new InetSocketAddress(theUri.getHost(), port);
    socket.connect(socketAddress, timeOut);
    return new TcpSenderConnection(socket);
}
}
