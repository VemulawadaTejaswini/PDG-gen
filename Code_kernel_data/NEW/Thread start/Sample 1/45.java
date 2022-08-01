//44
public class func{
	public void start(){
      Thread statusUpdateThread = new Thread(this);
      statusUpdateThread.setDaemon(true);
      statusUpdateThread.setName("Instrumentation Status Updates");
      statusUpdateThread.start();
}
}
