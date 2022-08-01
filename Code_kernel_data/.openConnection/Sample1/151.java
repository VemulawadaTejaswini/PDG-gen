//150
public class func{
	public void checkStatusCode(String sURL){
            URL url = new URL(sURL);
            URLConnection conn = url.openConnection();
            if (conn instanceof HttpURLConnection) {
                HttpURLConnection httpUrl = (HttpURLConnection) conn;
                return httpUrl.getResponseCode();
            }
}
}
