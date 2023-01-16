//32
public class func{
	public void test_setReuseAddressZ(){
        theSocket = new Socket();
        theSocket.connect(theAddress);
        stillActiveSocket = serverSocket.accept();
        serverSocket.close();
            serverSocket = new ServerSocket();
            serverSocket.bind(theAddress);
            fail("Unexpected exception when setReuseAddress is the default case and we bind:"
                    + theAddress.toString() + ":" + ex.toString());
}
}
