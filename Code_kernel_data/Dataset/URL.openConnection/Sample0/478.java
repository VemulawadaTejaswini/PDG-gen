//477
public class func{
	public void checkHttpURL(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String contentType = connection.getContentType();
}
}
