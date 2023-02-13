public class func{
public void testUndertow(){
     URL url = new URL("http:
     HttpURLConnection conn = HttpURLConnection.class.cast(url.openConnection());
     conn.connect();
     System.out.println("status: " + conn.getResponseCode());
     conn.getInputStream().read(b);
     System.out.println("result: " + new String(b));
}
}
