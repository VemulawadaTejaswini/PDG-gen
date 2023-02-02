//288
public class func{
	public void executeGet(String urlString,JSONHandler handler,boolean authenticated){
        LOGD(TAG, "Requesting URL: " + urlString);
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestProperty("User-Agent", mUserAgent);
}
}
