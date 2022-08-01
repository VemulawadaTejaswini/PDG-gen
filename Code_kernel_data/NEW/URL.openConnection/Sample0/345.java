//344
public class func{
	public void getRawHTTPConnection(String urlString){
        URL url = new URL(urlString);
        return (HttpURLConnection)url.openConnection();
}
}
