public class func{
public void testBind(){
    InetSocketAddress address = new InetSocketAddress("0.0.0.0",0);
    socket.bind(address);
      int min = socket.getLocalPort();
      conf.set("TestRange", min+"-"+max);
      ServerSocket socket2 = new ServerSocket();
}
}
