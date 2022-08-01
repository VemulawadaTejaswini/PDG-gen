//316
public class func{
	public void get(String url,Map<String,String> headers,boolean allowRedirect){
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
        setCommonProperties(headers, urlConnection, allowRedirect);
            in = readInputStream(urlConnection);
}
}
