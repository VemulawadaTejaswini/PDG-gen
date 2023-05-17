public class func{
public void checkConnectTimeForAddress(String address){
      socket.connect(new InetSocketAddress(address, PORT_FOR_TEST),
          TIME_OUT);
}
}
