//257
public class func{
	public void onCreate(Bundle savedInstanceState){
      URL url = new URL("http://www.vogella.de");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      readStream(con.getInputStream());
}
}
