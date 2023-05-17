public class func{
public void findUnusedPort(){
            socket.bind(new InetSocketAddress(0));
            port = socket.getLocalPort();
            socket.close();
}
}
