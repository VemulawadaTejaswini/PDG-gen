//210
public class func{
	public void loadImage(String url){
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(15000);
            is = new BufferedInputStream(connection.getInputStream());
}
}
