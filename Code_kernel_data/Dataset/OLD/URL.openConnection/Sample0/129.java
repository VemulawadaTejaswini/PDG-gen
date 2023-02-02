//128
public class func{
	public void connect(){
      URL url = new URL(URL);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //sink, leak
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
}
}
