//261
public class func{
	public void runClient(Proxy proxy,int serverPort){
            URL url = new URL(urlStr);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection(proxy);
            uc.getInputStream();
}
}
