//181
public class func{
	public void getConnection(String driverClass,String url,String userName,String password){
        logger.info("Connecting to database on " + url);
        conn = DriverManager.getConnection(url, userName, password);
}
}
