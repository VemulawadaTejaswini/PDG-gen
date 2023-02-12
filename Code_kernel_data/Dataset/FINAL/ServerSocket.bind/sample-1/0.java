public class func{
public void getRandomPort(){
    ServerSocket sock = new ServerSocket();
    sock.bind(null);
    int port = sock.getLocalPort();
    sock.close();
}
}
