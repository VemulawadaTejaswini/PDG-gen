//137
public class func{
public void connectWithTimeout(Socket socket){
        socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 1234), 500);
}
}
