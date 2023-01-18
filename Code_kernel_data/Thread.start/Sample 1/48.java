//47
public class func{
	public void installNatCheckMatcher(){
                Thread t = new Thread(new NatCheckRunnable());
                t.setDaemon(true);
                t.setName("OSF2F protocol matcher loader");
                t.start();
}
}
