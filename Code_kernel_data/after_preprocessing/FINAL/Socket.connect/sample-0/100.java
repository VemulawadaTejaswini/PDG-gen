public class func{
public void connectUnconnected(){
        sslSocket.connect(new java.net.InetSocketAddress("localhost",
                                                         serverPort));
        if (!sslSocket.isConnected())
            throw new Exception("Client socket is not connected!");
}
}
