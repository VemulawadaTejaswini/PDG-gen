//526
public class func{
	public void openConnection(URL url){
    return sClient != null ? sClient.open(url) : (HttpURLConnection) url.openConnection();
}
}
