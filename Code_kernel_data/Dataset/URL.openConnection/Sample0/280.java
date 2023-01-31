//279
public class func{
	public void doDownload(String from){
        URL url = new URL(from);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            InputStream in = conn.getInputStream();
}
}
