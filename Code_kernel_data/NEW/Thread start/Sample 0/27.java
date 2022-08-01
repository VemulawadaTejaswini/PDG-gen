//26
public class func{
	public void open(){
        if (proxyUrl == null) {
            serverSocket = new ServerSocket(listenPort);
            proxyUrl = urlFromSocket(target, serverSocket);
        } else {
            serverSocket = new ServerSocket(proxyUrl.getPort());
        }
        acceptor = new Acceptor(serverSocket, target);
        new Thread(null, acceptor, "SocketProxy-Acceptor-" + serverSocket.getLocalPort()).start();
}
}
