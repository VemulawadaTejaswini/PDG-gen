//66
public class func{
	public void exists(final String path,final ProcessContext processContext){
        final HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("HEAD");
        return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
