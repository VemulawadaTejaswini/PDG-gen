public class func{
public void startInternal(){
                Socket s = serverSocket.accept();
                new Thread(new DebuggerAuthProtocol(s)).start();
}
}
