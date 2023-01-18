//604
public class func{
	public void createConnection(String user,String password){
    LOGGER.info("url: " + url);
    return DriverManager.getConnection(url, oProps);
}
}
