//518
public class func{
	public void openConnection(URL requestTokenURL){
      HttpURLConnection connection = (HttpURLConnection) requestTokenURL.openConnection(selectProxy(requestTokenURL));
}
}
