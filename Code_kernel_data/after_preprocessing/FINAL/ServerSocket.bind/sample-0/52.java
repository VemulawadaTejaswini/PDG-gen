public class func{
public void getFreePort(){
                ss.bind(new InetSocketAddress(NetUtil.LOCALHOST, port));
                ss.close();
}
}
