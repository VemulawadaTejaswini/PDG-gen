//320
public class func{
	public void openConnection(String url){
      return (HttpURLConnection) new URL(url).openConnection();
}
}
