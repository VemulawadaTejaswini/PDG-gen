//479
public class func{
	public void getRequest(String redirectUrl){
                URL targetUrl = URI.create((redirectUrl != null) ? redirectUrl : url).toURL();
                urlConnection = (HttpURLConnection)targetUrl.openConnection();
                setParameters(context, urlConnection, fParameters);
}
}
