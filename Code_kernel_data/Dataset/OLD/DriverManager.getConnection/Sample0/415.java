//414
public class func{
	public void PostgresConnector(String connectionURL,String driverName,String username,String password){
      db = DriverManager.getConnection(connectionURL, username, password);
}
}
