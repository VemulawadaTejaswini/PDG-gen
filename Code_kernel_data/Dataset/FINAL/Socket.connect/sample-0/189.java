public class func{
public void debugEnabled(final int port){
        InetSocketAddress endPoint = new InetSocketAddress("localhost", port);
            socket.connect(endPoint);
}
}
