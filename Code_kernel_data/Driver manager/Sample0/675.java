//674
public class func{
	public void getJdbcConnection(){
    String password = getProperty(HIVESERVER_PASSWORD);
    return DriverManager.getConnection(url, user, password);
}
}
