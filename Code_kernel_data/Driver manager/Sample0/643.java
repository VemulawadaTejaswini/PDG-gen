//642
public class func{
	public void doGetConnection(Properties properties){
    Connection connection = DriverManager.getConnection(url, properties);
    configureConnection(connection);
}
}
