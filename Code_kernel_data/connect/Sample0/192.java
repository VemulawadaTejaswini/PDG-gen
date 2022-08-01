//191
public class func{
	public void waitForSuccessfulConnectionToZap(){
                socket.connect(new InetSocketAddress(HOST, port), connectionTimeoutInMs);
                throw new RuntimeException("Unable to connect to ZAP's proxy after " + timeoutInMs + " milliseconds.");
}
}
