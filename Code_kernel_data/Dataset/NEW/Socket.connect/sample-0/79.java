//79
public class func{
public void stopHTTPServer(){
        outputSocket.connect(new InetSocketAddress(APJP.APJP_LOCAL_HTTP_SERVER_ADDRESS, serverSocket.getLocalPort()));
        outputSocket.close();
}
}
