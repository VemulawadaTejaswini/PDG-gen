//169
public class func{
	public void guessInetAddress(List<InetAddress> ips){
      s.connect(new InetSocketAddress("8.8.8.8", 53), 3000);
      return s.getLocalAddress();
}
}
