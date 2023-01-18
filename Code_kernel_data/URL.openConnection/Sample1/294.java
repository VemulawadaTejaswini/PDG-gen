//293
public class func{
	public void HTTPAsyncGet(String urlString){
                logger.info("HTTPAsyncGet new with url: " + urlString);
                URL url = new URL(urlString);
                connection = url.openConnection();
                connection.setConnectTimeout(timeout);
}
}
