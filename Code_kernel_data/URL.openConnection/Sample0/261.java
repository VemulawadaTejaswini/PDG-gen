//260
public class func{
	public void doRequest(String uri){
        URL url = new URL(uri + "?foo="+reqnum);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        InputStream in = http.getInputStream();
}
}
