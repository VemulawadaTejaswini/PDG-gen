//442
public class func{
	public void getInputStream(String path,List<Parameter> parameters){
      LOG.debug("GET URL: {}", url.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.addRequestProperty("Pragma", "no-cache");
    conn.setRequestMethod("GET");
}
}
