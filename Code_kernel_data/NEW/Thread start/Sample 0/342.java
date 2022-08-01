//341
public class func{
	public void startServerThread(Socket s){
    Thread serverThread = new Thread(new ServerRunner(s));
      threads.add(serverThread);
    serverThread.start();
}
}
