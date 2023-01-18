//380
public class func{
	public void getInputStreamFromUrl(URL url){
    logger.debug("Connecting to URL " + url.toString());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.addRequestProperty("User-Agent", USER_AGENT);
    connection.connect();
    return new Buffe
}
}
