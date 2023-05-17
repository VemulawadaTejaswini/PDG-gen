//27
public class func{
public void test_isBound(){
        serverSocket.bind(new InetSocketAddress(addr, 0));
        assertTrue("Socket indicated  not bound when it should be (1)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0);
        assertTrue("Socket indicated  not bound when it should be (2)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0, 5, addr);
        assertTrue("Socket indicated  not bound when it should be (3)",
                serverSocket.isBound());
        serverSocket.close();
        serverSocket = new ServerSocket(0, 5);
        assertTrue("Socket indicated  not bound when it should be (4)",
                serverSocket.isBound());
        serverSocket.close();
}
}
