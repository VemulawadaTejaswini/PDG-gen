public class func{
public void start(){
            serverSocket = new ServerSocket(localPort);
            Thread serverThread = new Thread(new ServerRunner(serverSocket));
            serverThread.setName(LOGTAG);
            serverThread.start();
}
}
