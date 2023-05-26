//5
public class func{
public void doConnect(InetSocketAddress dest,int timeout){
            if (connectTimeout >= 0) {
                s.connect(dest, connectTimeout);
            } else {
                if (defaultConnectTimeout > 0) {
                    s.connect(dest, defaultConnectTimeout);
                } else {
                    s.connect(dest);
                }
            }
}
}
