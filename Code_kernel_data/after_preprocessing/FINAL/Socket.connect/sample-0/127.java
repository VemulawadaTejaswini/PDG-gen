public class func{
public void test_bindLjava_net_SocketAddress(){
        InetSocketAddress boundAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), sport);
        theSocket.connect(boundAddress);
        Socket worker = server.accept();
                worker.getRemoteSocketAddress());
}
}
