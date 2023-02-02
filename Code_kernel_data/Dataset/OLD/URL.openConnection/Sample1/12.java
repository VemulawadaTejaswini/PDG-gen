//11
public class func{
	public void getData(String query){
      if (URIMETHOD.matcher(query).find()) url = new URL(query);
      else url = new URL(baseUrl + query);
      LOG.debug("Accessing URL: " + url.toString());
      URLConnection conn = url.openConnection();
      conn.setConnectTimeout(connectionTimeout);
      conn.setReadTimeout(readTimeout);
      return conn.getInputStream();
}
}
