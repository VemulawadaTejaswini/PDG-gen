//196
public class func{
	public void readUrl(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        return readInputStream(hConn.getInputStream());
}
}
