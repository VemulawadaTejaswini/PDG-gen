public class func{
public void getLanIpAddress(){
            final InetSocketAddress sa = new InetSocketAddress(serverHost, serverPort);
                socket.connect(sa, 3000);
}
}
