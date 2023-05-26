//8
public class func{
public void setupNetSocket(String addr,int port){
    InetSocketAddress address = new InetSocketAddress(addr, port);
    if (address.isUnresolved()) {
      Logger.logf(Logger.ERROR, "CommonIO.setupNetSocket(): ERROR: Could not resolve address: " + addr);
      throw new UnresolvedAddressException();
    }
      newsock.connect(new InetSocketAddress(addr, port), NBConstants.SOCKET_TIMEOUT);
}
}
