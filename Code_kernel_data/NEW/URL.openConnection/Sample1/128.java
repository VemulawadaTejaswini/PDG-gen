//127
public class func{
	public void get(String url,String query,int connectTimeout,int readTimeout){
    if (query != null && !query.equals("")) {
      fullUrl += "?" + query;
    }
    URLConnection connection = new URL(fullUrl).openConnection();
    connection.setReadTimeout(readTimeout);
    connection.setConnectTimeout(connectTimeout);
    connection.setRequestProperty("Accept-Charset", CHARSET_UTF8);
    return getResponse((HttpURLConnection) connection);
}
}
