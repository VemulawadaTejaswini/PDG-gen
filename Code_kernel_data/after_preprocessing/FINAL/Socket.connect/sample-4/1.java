public class func{
public void connect(Socket socket,SocketAddress endpoint,int timeout){
    if (socket == null || endpoint == null || timeout < 0) {
      throw new IllegalArgumentException("Illegal argument for connect()");
    }
    SocketChannel ch = socket.getChannel();
    if (ch == null) {
      socket.connect(endpoint, timeout);
    } else {
      SocketIOWithTimeout.connect(ch, endpoint, timeout);
    }
}
}
