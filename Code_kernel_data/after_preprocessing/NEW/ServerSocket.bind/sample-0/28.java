//28
public class func{
public void testBindError(){
    InetSocketAddress address = new InetSocketAddress("0.0.0.0",0);
    socket.bind(address);
      int min = socket.getLocalPort();
      conf.set("TestRange", min+"-"+min);
      ServerSocket socket2 = new ServerSocket();
}
}
