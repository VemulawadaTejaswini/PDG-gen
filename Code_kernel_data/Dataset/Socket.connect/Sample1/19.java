//18
public class func{
	public void test_connectLjava_net_SocketAddressI(){
        Socket client = new Socket();
        client.connect(boundAddress, 0);
        assertTrue("Wrong connected status", client.isConnected());
        assertFalse("Wrong closed status", client.isClosed());
        assertTrue("Wrong bound status", client.isBound());
        assertFalse("Wrong input shutdown status", client.isInputShutdown());
        assertFalse("Wrong output shutdown status", client.isOutputShutdown());
        assertTrue("Local port was 0", client.getLocalPort() != 0);
        client.close();
}
}
