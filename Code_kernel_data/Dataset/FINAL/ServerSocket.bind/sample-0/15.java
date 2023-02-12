public class func{
public void setup(){
            s.bind(new InetSocketAddress(0));
            port = s.getLocalPort();
            s.close();
}
}
