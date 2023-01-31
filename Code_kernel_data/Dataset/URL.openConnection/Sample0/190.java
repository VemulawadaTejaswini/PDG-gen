//189
public class func{
	public void doClientSide(){
        URL url = new URL("https://localhost:" + serverPort + "/");
        HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
        System.out.println("response is " + urlc.getResponseCode());
}
}
