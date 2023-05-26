//32
public class func{
public void acceptUnbound(){
        sslServerSocket.bind(new java.net.InetSocketAddress(serverPort));
        if (!sslServerSocket.isBound())
            throw new Exception("Server socket is not bound!");
        Socket sslSocket = sslServerSocket.accept();
        sslServerSocket.close();
}
}
