//422
public class func{
	public void connectToPath(final String path){
    final URL url = url(path);
    final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
}
}
