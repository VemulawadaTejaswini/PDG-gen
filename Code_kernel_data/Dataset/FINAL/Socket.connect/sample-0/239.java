public class func{
public void ensureConnected(){
      masterSocket.connect(new InetSocketAddress(host, masterPort), timeout);
}
}
