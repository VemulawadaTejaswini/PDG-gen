//181
public class func{
	public void testAdmin(@ArquillianResource URL url){
        URLConnection uc = new URL(url, "_ah/admin").openConnection();
        HttpURLConnection conn = (HttpURLConnection) uc;
        conn.connect();
        conn.getInputStream().read();
}
}
