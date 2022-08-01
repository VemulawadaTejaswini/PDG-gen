//276
public class func{
	public void doClientSide(){
        URL url = new URL("https://"+host+":"+serverPort+"/index.html");
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
        InputStream is = urlc.getInputStream();
        is.close();
}
}
