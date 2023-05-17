public class func{
public void isKdcReachableViaTCP(String server,int port){
      socket.connect(new InetSocketAddress(server, port), config.getKdcConnectionCheckTimeout());
}
}
