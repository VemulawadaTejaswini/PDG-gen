//168
public class func{
	public void test8(String u){
        URL url = new URL (u);
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
        urlc.setFixedLengthStreamingMode (0);
        urlc.setDoOutput(true);
        urlc.setRequestMethod ("POST");
        OutputStream os = urlc.getOutputStream ();
        os.close();
}
}
