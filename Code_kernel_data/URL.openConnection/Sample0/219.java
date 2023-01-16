//218
public class func{
	public void test9(String u){
        URL url = new URL (u);
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
        urlc.setChunkedStreamingMode (-1);
        urlc.setDoOutput(true);
        urlc.setRequestMethod ("POST");
        OutputStream os = urlc.getOutputStream ();
}
}
