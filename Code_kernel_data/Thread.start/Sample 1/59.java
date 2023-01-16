//58
public class func{
	public void init(M queue){
    Thread daemon = new Thread(new RetryConsumer(this));
    daemon.setName("RetryHandler");
    daemon.setDaemon(true);
    daemon.start();
}
}
