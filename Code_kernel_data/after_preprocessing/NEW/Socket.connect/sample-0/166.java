//166
public class func{
public void newClient(Connection connection){
    socket.connect(new InetSocketAddress(host, port));
    trans = new TSocket(socket);
    TProtocol proto = new TBinaryProtocol(new TFramedTransport(trans));
    Client client = new Client(proto);
}
}
