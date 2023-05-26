public class func{
public void tryToConnect(InetAddress fromAddress,SocketAddress toSocket,int timeout){
      SocketAddress bindP = new InetSocketAddress(fromAddress, 0);
      socket.bind(bindP);
      socket.connect(toSocket, timeout);
}
}
