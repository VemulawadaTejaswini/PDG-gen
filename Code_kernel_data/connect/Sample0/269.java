//268
public class func{
	public void startClient(){
            s.connect(new InetSocketAddress(oc.address, oc.port), SOCKET_TIMEOUT);
            openSocketStreams(s);
            log(LOG_VERBOSE, "Client connected,");
            startThread("capsule-comm", "receiveLoop");
            log(LOG_QUIET, "Client connection failed.");
            printError(e);
            closeComm();
}
}
