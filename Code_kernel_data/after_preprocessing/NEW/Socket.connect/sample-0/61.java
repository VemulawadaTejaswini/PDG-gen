//61
public class func{
public void disconnect(final int port,int tries){
            s.connect(new InetSocketAddress(this.host, port), connectTimeout);
            s.getOutputStream().close();
}
}
