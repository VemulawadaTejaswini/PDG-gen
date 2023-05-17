//212
public class func{
public void SocketConnectionFacadeImpl(String host,int port,boolean ssl,int timeout,int readTimeout,Pattern lineDelimiter){
        socket.connect(new InetSocketAddress(host, port), timeout);
        initialize(socket, lineDelimiter);
}
}
