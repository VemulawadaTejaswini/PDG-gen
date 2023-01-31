//276
public class func{
	public void getRedirectUrl(String urlStr){
        URL url = new URL(urlStr);
        URLConnection conn = url.openConnection();
        String location = conn.getHeaderField("Location");
}
}
