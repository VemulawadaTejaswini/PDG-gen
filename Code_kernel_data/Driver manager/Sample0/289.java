//288
public class func{
	public void checkConnectionExists(String url,String user,String password){
    String  driver = JDBC.getDriverString(url);
      JDBC.loadDriver(driver);
      DriverManager.getConnection(url, user, password);
}
}
