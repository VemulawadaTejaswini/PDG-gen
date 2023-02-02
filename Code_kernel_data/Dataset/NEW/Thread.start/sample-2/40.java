//40
public class func{
public void handshake(){
        WrapperFuture<Void,Void> wFuture = new WrapperFuture<>();
        Thread t = new WebSocketSslHandshakeThread(wFuture);
        t.start();
}
}
