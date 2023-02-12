public class func{
public void run(){
                InetSocketAddress addr = new InetSocketAddress(host, port);
                socket.connect(addr);
                socket.close();
}
}
