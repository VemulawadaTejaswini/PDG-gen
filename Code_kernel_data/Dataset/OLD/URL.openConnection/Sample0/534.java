//533
public class func{
	public void getResponse(URL url,int numberOfRetries){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    return getResponse(connection, numberOfRetries);
}
}
