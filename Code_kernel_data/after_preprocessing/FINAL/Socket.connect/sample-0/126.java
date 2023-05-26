public class func{
public void performancePreferenceTest(int connectionTime,int latency,int bandwidth){
        InetSocketAddress clAddress = new InetSocketAddress(InetAddress
                .getLocalHost(), portNumber);
        clientSocket.connect(clAddress);
        Socket servSock = theSocket.accept();
}
}
