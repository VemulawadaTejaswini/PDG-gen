//52
public class func{
	public void getText(String url){
      URL website = new URL(url);
      URLConnection connection = website.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
}
}
