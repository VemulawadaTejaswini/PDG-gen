//231
public class func{
	public void makeHttpCall(){
            URL url = new URL("https" , firstNonLoAddress.getHostAddress(),
                                server.getLocalPort(), "/");
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();
            System.out.println(uc.getResponseCode());
}
}
