//448
public class func{
	public void doGet(final String url){
                HttpURLConnection httpUrlConnection = (HttpURLConnection) (new URL(url)).openConnection();
                BufferedReader rd = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
}
}
