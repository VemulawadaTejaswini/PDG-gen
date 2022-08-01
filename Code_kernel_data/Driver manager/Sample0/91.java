//90
public class func{
	public void createConnection(String driverClassName,String url){
    connection = DriverManager.getConnection(url);
    connection.setAutoCommit(false);
}
}
