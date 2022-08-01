//76
public class func{
	public void getConnection(){
    String password = PROPERTIES.getProperty("jdbc.password");
      Class.forName(driver);
      connection = DriverManager.getConnection(url, username, password);
}
}
