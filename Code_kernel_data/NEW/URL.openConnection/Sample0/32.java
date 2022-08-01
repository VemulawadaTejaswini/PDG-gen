//31
public class func{
	public void isPutIntoOven(){
            final URL url = new URL("https://www.google.com/search?q=potato");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int inOven = connection.getResponseCode();
}
}
