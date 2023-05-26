//54
public class func{
public void canBindToLocalSocket(String host,int port){
        socket.bind(new InetSocketAddress(host, port));
          socket.close();
}
}
