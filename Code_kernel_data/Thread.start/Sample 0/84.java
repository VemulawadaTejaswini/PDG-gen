//83
public class func{
	public void doOpen(){
    new Thread(null, acceptor, "SocketProxy-Acceptor-"
        + serverSocket.getLocalPort()).start();
}
}
