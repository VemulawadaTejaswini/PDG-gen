//45
public class func{
	public void start(){
    Thread t = new Thread(this);
    t.setDaemon(true);
    t.setName("Network Data Receiver");
    t.start();
}
}
