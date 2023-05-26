public class func{
public void isPortOccupied(final int port){
    logger.fine("Checking port " + port);
      sock.connect(new InetSocketAddress("127.0.0.1", port));
      logger.fine("Connected to port " + port);
}
}
