//1
public class func{
public void init(DaemonContext context){
        ServerSocketChannel.open().socket() : new ServerSocket();
    ss.bind(socAddr, 0);
    if(ss.getLocalPort() != socAddr.getPort())
      throw new RuntimeException("Unable to bind on specified streaming port in secure " +
          "context. Needed " + socAddr.getPort() + ", got " + ss.getLocalPort());
}
}
