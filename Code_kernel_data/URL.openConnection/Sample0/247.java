//246
public class func{
	public void readUrlAsDocument(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        return newDocumentBuilder().parse(hConn.getInputStream());
}
}
