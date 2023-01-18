//271
public class func{
	public void openConnectionInternal(){
        String params = getParameterString();
        if (params != null && params.length() > 0) {
            url = url + "?" + params;
        }
        URL getUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) getUrl.openConnection();
}
}
