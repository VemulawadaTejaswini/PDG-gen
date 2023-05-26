//10
public class func{
public void test_setReuseAddressZ(){
        serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(anyAddress);
        theAddress = serverSocket.getLocalSocketAddress();
}
}
