public class func{
public void onCreate(Bundle savedInstanceState){
      URL url = new URL("http:
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      readStream(con.getInputStream());
}
}
