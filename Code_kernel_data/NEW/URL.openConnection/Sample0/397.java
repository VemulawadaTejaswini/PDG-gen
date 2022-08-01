//396
public class func{
	public void getHttpCode(URL resource){
    HttpURLConnection con = (HttpURLConnection) resource.openConnection();
    con.setRequestMethod("HEAD");
    return con.getResponseCode();
}
}
