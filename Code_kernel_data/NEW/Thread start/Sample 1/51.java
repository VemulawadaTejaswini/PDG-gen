//50
public class func{
	public void start(int clientNum){
    Thread clientThread = new Thread(this);
    clientThread.setDaemon(true);
    clientThread.setName("AgentServer-Client" + clientNum);
    clientThread.start();
}
}
