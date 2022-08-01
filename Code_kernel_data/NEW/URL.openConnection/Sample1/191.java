//190
public class func{
	public void checkKmlUrl(String urlString){
            URL url = new URL(urlString);
            URLConnection myURLConnection = url.openConnection();
            myURLConnection.connect();
}
}
