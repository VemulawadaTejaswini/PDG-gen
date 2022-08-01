//287
public class func{
	public void createConnection(String uri){
        URL url = new URL(uri);
            (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Connection", "close");
}
}
