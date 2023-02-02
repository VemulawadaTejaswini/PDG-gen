//225
public class func{
	public void runIt(){
    UdpUnicastEndToEndTests launcher = new UdpUnicastEndToEndTests();
    Thread t = new Thread(launcher);
    t.start(); // launch the receiver
}
}
