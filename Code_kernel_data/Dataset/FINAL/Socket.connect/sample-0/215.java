public class func{
public void tryConnection(String byConnecting,int port){
      socket.connect(new InetSocketAddress(byConnecting, port), 2000); // 2 seconds timeout
}
}
