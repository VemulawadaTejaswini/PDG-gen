public class func{
public void testSocketExternalResourceAnalyzer(){
        final Socket socket = new Socket();
            socket.connect(connectAddress, 125);
            Assert.fail("Unexpected success to connect to " + connectAddress);
}
}
