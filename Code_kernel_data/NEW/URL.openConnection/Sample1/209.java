//208
public class func{
	public void IsNetworkAvailable(){
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
}
}
