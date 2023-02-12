public class func{
public void create(Address addr){
            socket.connect(new InetSocketAddress(hostName, portNumber),
                    connectionTimeout);
            return create(socket);
            quietTrySocketClose(socket);
}
}
