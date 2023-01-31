//141
public class func{
	public void doStart(){
      new Thread(new RabbitMqProcessor.ConnectionRunnable(Integer.MAX_VALUE, configuration.getReconnectDelay())).start();
}
}
