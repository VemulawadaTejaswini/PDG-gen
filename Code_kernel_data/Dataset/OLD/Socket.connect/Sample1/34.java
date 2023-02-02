//33
public class func{
	public void test_setReuseAddressZ(){
        Socket theSocket = new Socket();
        theSocket.connect(theAddress);
        Socket stillActiveSocket = serverSocket.accept();
        serverSocket.close();
}
}
