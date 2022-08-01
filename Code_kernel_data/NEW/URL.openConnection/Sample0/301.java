//300
public class func{
	public void getConnection(String urlString){
    URL url = new URL(urlString);
    return (HttpURLConnection) url.openConnection();
}
}
