public class func{
public void getUnusedPort(){
                InetSocketAddress address = new InetSocketAddress(InetAddress.getByName("localhost"), port);
                serverSocket.bind(address, 10);
}
}
