//364
public class func{
	public void newConnection(){
            return dataSource != null ? dataSource.getConnection() : DriverManager.getConnection(connectionURL, username,
                                                                                                 password);
}
}
