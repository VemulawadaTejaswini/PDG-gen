public class func{
public void doBind(InetSocketAddress addr){
            ServerSocket svr = new ServerSocket();
            svr.bind(null);
            InetSocketAddress bad = (InetSocketAddress) svr.getLocalSocketAddress();
}
}
