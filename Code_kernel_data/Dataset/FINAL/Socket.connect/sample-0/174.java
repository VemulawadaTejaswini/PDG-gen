public class func{
public void connect(String type,String host,int port){
      sk.connect(new InetSocketAddress(host, port));
      Client cl = db.new Client(sk);
      cl.setDaemon(true);
      cl.start();
}
}
