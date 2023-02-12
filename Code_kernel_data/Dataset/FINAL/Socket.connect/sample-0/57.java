public class func{
public void connect(final int port,int tries){
            s.connect(new InetSocketAddress(this.host, port), connectTimeout);
            s.getOutputStream().close();
}
}
