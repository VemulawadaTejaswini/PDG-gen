//10
public class func{
	public void testIsPortAvailableValidatesAddress(){
        ss.bind(new InetSocketAddress(InetAddress.getLocalHost(), 0));
        int boundPort = ss.getLocalPort();
        assertTrue(ss.isBound());
        assertNotEquals(boundPort, 0);
        assertFalse(Networking.isPortAvailable(boundPort));
        ss.close();
}
}
