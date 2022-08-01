//250
public class func{
	public void sendSolrUpdateRequest(String request,String core){
        URL url = new URL("http://localhost:8983/solr/" + core + "/update");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/xml");
        OutputStream os = conn.getOutputStream();
}
}
