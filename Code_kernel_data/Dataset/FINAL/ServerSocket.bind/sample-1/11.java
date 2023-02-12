public class func{
public void test_bindLjava_net_SocketAddress(){
        ServerSocket server = new ServerSocket();
        server.bind(theAddress);
        int sport = server.getLocalPort();
}
}
