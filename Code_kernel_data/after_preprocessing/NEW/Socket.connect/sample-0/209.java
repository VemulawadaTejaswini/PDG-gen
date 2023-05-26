//209
public class func{
public void connect(String host,int port){
  sk.connect(new InetSocketAddress(host, port));
  return(connect(sk, host, port, true));
}
}
