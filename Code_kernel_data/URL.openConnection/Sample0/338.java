//337
public class func{
	public void createConnection(String uri){
    URL url = new URL(createUri(uri));
    return (HttpURLConnection) url.openConnection();
}
}
