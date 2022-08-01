//348
public class func{
	public void openConnection(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection uc = (HttpURLConnection) url.openConnection();
}
}
