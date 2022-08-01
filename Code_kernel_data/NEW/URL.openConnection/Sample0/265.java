//264
public class func{
	public void openConnection(String url){
        URL u = new URL(url);
        urlConnection = (HttpURLConnection)u.openConnection();
        urlConnection.setRequestProperty("User-Agent", userAgent);
        urlConnection.setUseCaches(true);
}
}
