//29
public class func{
	public void init(){
    Thread connectorThread = new Thread(this.connector, "IM-Reconnector-Thread");
    connectorThread.setDaemon(true);
    connectorThread.start();
}
}
