//243
public class func{
	public void getConnection(){
    LOG.debug("Metric store connection url: " + url);
      return DriverManager.getConnection(url);
}
}
