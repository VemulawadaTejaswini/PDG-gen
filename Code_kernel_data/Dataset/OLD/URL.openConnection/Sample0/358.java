//357
public class func{
	public void getUrlConnection(final String url){
        return (HttpURLConnection) new URL( url ).openConnection();
}
}
