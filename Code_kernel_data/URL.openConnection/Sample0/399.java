//398
public class func{
	public void exists(){
            HttpURLConnection con = (HttpURLConnection) URL.openConnection();
            con.setRequestMethod("HEAD");
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
