//220
public class func{
	public void open(String driver,String url,String user,String password){
            Connection connection = DriverManager.getConnection(url, user, password);
            ConnectionsAccess.attach(name, connection, url);
            throw new InitException("Failed to connect to JDBC URL: " + url, e);
}
}
