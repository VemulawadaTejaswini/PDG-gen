//393
public class func{
	public void isUrlValid(URL url){
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("HEAD");
      int responseCode = connection.getResponseCode();
}
}
