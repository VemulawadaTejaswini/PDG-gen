//227
public class func{
public void testSecurePing(@ArquillianResource URL url){
        URLConnection uc = new URL(url, "secure").openConnection();
        HttpURLConnection conn = (HttpURLConnection) uc;
        conn.connect();
            conn.getInputStream();
}
}
