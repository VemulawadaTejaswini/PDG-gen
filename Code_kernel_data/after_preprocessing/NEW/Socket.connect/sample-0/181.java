//181
public class func{
public void connectSocket(Socket s,String host,int port,InetAddress localAddress,int localPort,HttpParams params){
        s.connect(new InetSocketAddress(host, port));
}
}
