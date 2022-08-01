//104
public class func{
	public void getConnection(String url){
      URLConnection conn = new URL(url).openConnection();
      is = conn.getInputStream();
}
}
