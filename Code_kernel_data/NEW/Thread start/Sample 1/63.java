//62
public class func{
	public void init(M delayQueue){
    Thread daemon = new Thread(new LateRerunConsumer(this));
    daemon.setName("LaterunHandler");
    daemon.setDaemon(true);
    daemon.start();
}
}
