//219
public class func{
	public void connection(){
    final URL url = new URL(pth);
    final URLConnection conn = url.openConnection();
    conn.setConnectTimeout(TIMEOUT * 1000);
}
}
