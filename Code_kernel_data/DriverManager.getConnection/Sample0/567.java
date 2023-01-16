//566
public class func{
	public void getPooledConnection(){
            (JDBCConnection) DriverManager.getConnection(url, connProperties);
        return createPooledConnection(connection);
}
}
