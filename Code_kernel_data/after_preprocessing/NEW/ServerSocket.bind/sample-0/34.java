//34
public class func{
public void freePort(){
      socket.bind(new InetSocketAddress(0));
      return socket.getLocalPort();
}
}
