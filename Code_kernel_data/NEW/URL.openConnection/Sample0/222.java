//221
public class func{
	public void invokeServer(String uri){
    URL url = new URL("http://localhost:" + RANDOM_SERVER_PORT + uri);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    Util.readToString(connection.getInputStream());
}
}
