//220
public class func{
	public void fetchXml(String doi){
    URL url = new URL(doi);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.connect();
    InputStream is = conn.getInputStream();
    String result = IOUtils.toString(is);
    is.close();
}
}
