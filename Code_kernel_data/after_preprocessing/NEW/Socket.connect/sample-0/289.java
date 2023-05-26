//289
public class func{
public void tryToConnect(InetAddress fromAddress,SocketAddress toSocket,int timeout){
      SocketAddress bindP = new InetSocketAddress(fromAddress, 0); // 0 = let the OS choose the port on this
      socket.bind(bindP);
      socket.connect(toSocket, timeout);
}
}
