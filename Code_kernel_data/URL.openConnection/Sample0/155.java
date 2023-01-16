//154
public class func{
	public void get(String urlS){
        URL url = new URL(urlS);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return getResponseBody(connection);
}
}
