public class func{
public void sendSolrUpdateRequest(String request,String core){
        URL url = new URL("http:
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/xml");
        OutputStream os = conn.getOutputStream();
}
}
