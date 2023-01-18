//30
public class func{
	public void isValid(String url){
        URL u = new URL(url);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.setRequestMethod("HEAD");
        huc.connect();
        isValid = huc.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
