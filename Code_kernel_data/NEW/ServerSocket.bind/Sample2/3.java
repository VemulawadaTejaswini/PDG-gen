//2
public class func{
	public void test_setReuseAddressZ(){
            serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(false);
            serverSocket.bind(theAddress);
            fail("No exception when setReuseAddress is false and we bind:" + theAddress.toString());
}
}
