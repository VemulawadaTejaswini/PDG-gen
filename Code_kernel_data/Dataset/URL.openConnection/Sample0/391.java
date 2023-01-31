//390
public class func{
	public void createGETRequestConnection(URL website){
        HttpURLConnection connection = (HttpURLConnection) website.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.connect();
}
}
