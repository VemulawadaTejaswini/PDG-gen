//118
public class func{
public void testCreateServerSocket(){
        serverSocket.bind(new InetSocketAddress(0));
        testSocket(serverSocket, 50);
}
}
