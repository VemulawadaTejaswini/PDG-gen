//133
public class func{
	public void post(String urlString,String xmlRequest){
        URL url = new URL(urlString);
        HttpURLConnection  conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "text/xml");
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream(), UTF8.UTF8);
        wr.write(xmlRequest);
        wr.flush();
}
}
