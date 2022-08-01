//59
public class func{
	public void startDeamonThread(boolean blockUntilStarted){
        Thread t = new Thread(this);
        t.setName("Socks server");
        t.setDaemon(true);
        t.start();
}
}
