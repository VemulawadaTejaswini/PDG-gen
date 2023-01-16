//407
public class func{
	public void getHttpURLConnection(URL url,int timeout){
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(40000);
                httpURLConnection.setReadTimeout(timeout);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setRequestMethod("POST");
}
}
