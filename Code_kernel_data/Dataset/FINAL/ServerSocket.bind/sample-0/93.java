public class func{
public void openSocket(){
      Log.info("Opening port to listen", "port", port);
      InetSocketAddress addr = new InetSocketAddress(port);
      socket.bind(addr);
      Log.info("Opened socket", "address", addr);
}
}
