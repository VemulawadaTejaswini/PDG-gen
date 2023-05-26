//95
public class func{
public void isOpen(String host,int port){
            socket.connect(new InetSocketAddress(host, port), (int) TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS));
            socket.close();
}
}
