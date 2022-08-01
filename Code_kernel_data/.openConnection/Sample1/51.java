//50
public class func{
	public void fetch(String address){
      URL url = new URL(address);
          URLConnection conn = url.openConnection();
          BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
}
}
