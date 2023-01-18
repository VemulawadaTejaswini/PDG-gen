//491
public class func{
	public void openHttpConnection(URL httpURL){
            Main.debug("Opening HTTP connection to "+httpURL.toExternalForm());
        HttpURLConnection connection = (HttpURLConnection) httpURL.openConnection();
}
}
